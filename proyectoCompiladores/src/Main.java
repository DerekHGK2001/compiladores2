import Interpreter.*;
import org.antlr.v4.runtime.*;

import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JFileChooser fileChooser = new JFileChooser();
        boolean finalizar = false;

        try {
            File fileM = new File("C:/Users/dhenr/Documents/Clases/Compiladores/minipascal.txt");
            BufferedReader reader = new BufferedReader(new FileReader(fileM));
            StringBuilder contenido = new StringBuilder();
            String linea;

            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }

            CharStream charStream = CharStreams.fromString(contenido.toString());
            CustomErrorListener errorListener = new CustomErrorListener(new CommonTokenStream(new InterpreterLexer(charStream)));
            InterpreterParser parser = new InterpreterParser(new CommonTokenStream(new InterpreterLexer(charStream)));
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            // Después de que se completa el análisis sintáctico, llamamos a visitProgram para activar el análisis semántico.
            InterpreterParser.ProgramContext programContext = parser.program();

            if (!errorListener.getErrores().isEmpty()) {
                System.err.println("\nSe encontraron errores sintácticos:");
                for (String error : errorListener.getErrores()) {
                    System.err.println(error);
                }
            } else {
                System.out.println("\nAnálisis Léxico y Sintáctico finalizado con éxito");

                // Llamamos a visitProgram para activar el análisis semántico.
                visitors visitor = new visitors();
                visitor.visitProgram(programContext);

                // Verificar si hay errores semánticos
                List<String> listaErrores = visitor.getListaErrores();
                if (!listaErrores.isEmpty()) {
                    System.err.println("Se encontraron errores semánticos:");
                    for (String error : listaErrores) {
                        System.err.println(error);
                    }
                } else {
                    System.out.println("Análisis Semántico finalizado con éxito");

                    visitorsLLVM visitorllvm = new visitorsLLVM();
                    visitorllvm.visitProgram(programContext);


                    try (FileWriter writer = new FileWriter("main.ll")) {
                        writer.write(visitorllvm.getllvm());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    compileWithClang("main.ll","main");

                    //compileWithExe();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al leer el archivo Mini-Pascal: " + e.getMessage());
        }
    }


    private static void compileWithClang(String llvmFileName, String outputFileName) {
        try {
            // Construir el comando para compilar con clang
            ProcessBuilder processBuilder = new ProcessBuilder("clang", llvmFileName, "-o", outputFileName+".exe");

            // Redirigir la salida y el error estándar al mismo flujo
            processBuilder.redirectErrorStream(true);

            // Ejecutar el proceso
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            // Esperar a que el proceso termine
            int exitCode = process.waitFor();

            // Verificar el código de salida
            if (exitCode == 0) {
                System.out.println("Compilación exitosa.");
            } else {
                System.err.println("Error durante la compilación. Código de salida: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void compileWithExe() {
        try {
            // Construir el comando para compilar con clang
            ProcessBuilder processBuilder = new ProcessBuilder(".\\main.exe");

            // Redirigir la salida y el error estándar al mismo flujo
            processBuilder.redirectErrorStream(true);

            // Ejecutar el proceso
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            // Esperar a que el proceso termine
            int exitCode = process.waitFor();

            // Verificar el código de salida
            if (exitCode == 0) {
                System.out.println("Compilación exitosa.");
            } else {
                System.err.println("Error durante la compilación. Código de salida: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
