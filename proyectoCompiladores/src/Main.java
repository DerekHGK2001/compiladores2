import Interpreter.*;
import org.antlr.v4.runtime.*;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
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
                System.err.println("Se encontraron errores:");
                for (String error : errorListener.getErrores()) {
                    System.err.println(error);
                }
            } else {
                System.out.println("\nAnálisis Léxico y Sintáctico finalizado con éxito\n");
                // Llamamos a visitProgram para activar el análisis semántico.
                visitors visitor = new visitors();
                visitor.visitProgram(programContext);

                Map<String, Object> symbolTable = visitor.getSymbolTable();

                // Imprimimos la tabla de símbolos.
                System.out.println("\nTabla de Símbolos:");
                for (Map.Entry<String, Object> entry : symbolTable.entrySet()) {
                    String variableName = entry.getKey();
                    Object variableEntry = entry.getValue();

                    if (variableEntry instanceof EntryVariable) {
                        EntryVariable entryVariable = (EntryVariable) variableEntry;
                        System.out.println("Variable: " + entryVariable.getName() + ", Tipo: " + entryVariable.getType() + ", ámbito: " + entryVariable.getAmbit());
                    } else {
                        System.err.println("Tipo desconocido para la variable: " + variableName);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al leer el archivo Mini-Pascal: " + e.getMessage());
        }
    }
}