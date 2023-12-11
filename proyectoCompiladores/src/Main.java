import Interpreter.*;
import org.antlr.v4.runtime.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;

public class Main extends JFrame {
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private visitors visitor = new visitors();

    public Main() {
        // Configuración de la ventana principal
        setTitle("Mini Pascal Interpreter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));

        // Crear un panel principal con GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Botón de ejecución
        JButton runButton = new JButton("RUN");
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeProgram();
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(runButton, gbc);

        // Área de texto para el código de entrada
        inputTextArea = new JTextArea();
        JScrollPane inputScrollPane = new JScrollPane(inputTextArea);
        inputScrollPane.setPreferredSize(new Dimension(700, 200));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        mainPanel.add(inputScrollPane, gbc);

        // Área de texto para la salida
        outputTextArea = new JTextArea();
        JScrollPane outputScrollPane = new JScrollPane(outputTextArea);
        outputScrollPane.setPreferredSize(new Dimension(700, 200));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        mainPanel.add(outputScrollPane, gbc);

        // Añadir el panel principal a la ventana
        add(mainPanel);

        // Configurar la ventana
        pack();
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }

    private void executeProgram() {
        visitor.reiniciar();
        String contenido = inputTextArea.getText();

        CharStream charStream = CharStreams.fromString(contenido);
        CustomErrorListener errorListener = new CustomErrorListener(new CommonTokenStream(new InterpreterLexer(charStream)));
        InterpreterParser parser = new InterpreterParser(new CommonTokenStream(new InterpreterLexer(charStream)));
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        // Después de que se completa el análisis sintáctico, llamamos a visitProgram para activar el análisis semántico.
        InterpreterParser.ProgramContext programContext = parser.program();

        if (!errorListener.getErrores().isEmpty()) {
            outputTextArea.setText("Se encontraron errores lexicos y sintácticos:\n");
            for (String error : errorListener.getErrores()) {
                outputTextArea.append(error + "\n");
            }
        } else {
            // Llamamos a visitProgram para activar el análisis semántico.
            visitor.visitProgram(programContext);

            // Verificar si hay errores semánticos
            List<String> listaErrores = visitor.getListaErrores();
            if (!listaErrores.isEmpty()) {
                outputTextArea.append("Se encontraron errores semánticos:\n");
                for (String error : listaErrores) {
                    outputTextArea.append(error + "\n");
                }
                visitor.reiniciar();
            } else {

                visitorsLLVM visitorllvm = new visitorsLLVM();
                visitorllvm.visitProgram(programContext);

                try (FileWriter writer = new FileWriter("main.ll")) {
                    writer.write(visitorllvm.getllvm());

                    visitorllvm.clearllvm();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                compileWithClang("main.ll", "main");

                executeWithExe();
            }
        }
    }
    int error = 0;
    private void compileWithClang(String llvmFileName, String outputFileName) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("clang", llvmFileName, "-o", outputFileName + ".exe");
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            int exitCode = process.waitFor();
            error=exitCode;
            if (exitCode != 0) {
                outputTextArea.setText("Error durante la compilación.\n");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void executeWithExe() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(".\\" + "main.exe");
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            int exitCode = process.waitFor();
            if (exitCode == 0 && error==0) {
                outputTextArea.setText("\nSalida del programa:\n\n");
                String line;
                while ((line = reader.readLine()) != null) {
                    outputTextArea.append(line + "\n");
                }
            } else {
                outputTextArea.setText("\nError durante la ejecución. Código de salida: " + exitCode + "\n");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
