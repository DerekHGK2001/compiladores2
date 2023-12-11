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
    visitors visitor = new visitors();

    public Main() {
        // Configuración de la ventana principal
        setTitle("Mini Pascal Interpreter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Configuración del diseño
        setLayout(new BorderLayout());

        // Área de texto para el código de entrada
        inputTextArea = new JTextArea();
        JScrollPane inputScrollPane = new JScrollPane(inputTextArea);
        inputScrollPane.setPreferredSize(new Dimension(getWidth(), getHeight() / 2));
        add(inputScrollPane, BorderLayout.CENTER);

        // Botón de ejecución
        JButton runButton = new JButton("RUN");
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeProgram();
            }
        });
        add(runButton, BorderLayout.NORTH);

        // Área de texto para la salida
        outputTextArea = new JTextArea();
        JScrollPane outputScrollPane = new JScrollPane(outputTextArea);
        outputScrollPane.setPreferredSize(new Dimension(getWidth(), getHeight() / 3));
        add(outputScrollPane, BorderLayout.SOUTH);
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
            outputTextArea.setText("Análisis Léxico y Sintáctico finalizado con éxito\n");

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
                outputTextArea.append("Análisis Semántico finalizado con éxito\n");

                visitorsLLVM visitorllvm = new visitorsLLVM();
                visitorllvm.visitProgram(programContext);

                try (FileWriter writer = new FileWriter("main.ll")) {
                    writer.write(visitorllvm.getllvm());
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
                outputTextArea.append("Error durante la compilación.\n");
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
                outputTextArea.append("\nSalida del programa:\n");
                String line;
                while ((line = reader.readLine()) != null) {
                    outputTextArea.append(line + "\n");
                }
            } else {
                outputTextArea.append("\nError durante la ejecución. Código de salida: " + exitCode + "\n");
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
