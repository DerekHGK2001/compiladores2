import Interpreter.*;
import org.antlr.v4.runtime.*;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al leer el archivo Mini-Pascal: " + e.getMessage());
        }
    }
}