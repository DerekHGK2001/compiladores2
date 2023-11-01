import Interpreter.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JFileChooser fileChooser = new JFileChooser();
        boolean finalizar = false;

        try {
            while (!finalizar) {
                visitors.getSymbolTable().clear();

                System.out.println("\n************* ANALIZADOR LÉXICO Y SINTÁCTICO *************");
                System.out.print(
                        "1. Seleccionar archivo Mini-Pascal \n" +
                                "2. Salir \n" +
                                "Opción: ");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        fileChooser.showOpenDialog(fileChooser);
                        String ruta = fileChooser.getSelectedFile().getAbsolutePath();
                        int lastIndex = ruta.lastIndexOf(".");

                        if (lastIndex != -1) {
                            String extension = ruta.substring(lastIndex + 1);

                            if (extension.equalsIgnoreCase("txt")) {
                                File fileM = new File(ruta);
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
                                    System.out.println("\nAnalisis Lexico y Sintactico finalizado con exito\n");
                                    // Llamamos a visitProgram para activar el análisis semántico.
                                    new visitors().visitProgram(programContext);

                                    Map<String, Object> symbolTable = visitors.getSymbolTable();//Esto es para obtener los datos de la tabla.

                                    // Imprimimos la tabla de símbolos.
                                    System.out.println("\nTabla de Símbolos:");
                                    for (Map.Entry<String, Object> entry : symbolTable.entrySet()) {
                                        String variableName = entry.getKey();
                                        Object variableEntry = entry.getValue();

                                        if (variableEntry instanceof SymbolEntry) {
                                            SymbolEntry symbolEntry = (SymbolEntry) variableEntry;
                                            System.out.println("Variable: " +  symbolEntry.getName() + ", Tipo: " + symbolEntry.getType());
                                        } else if (variableEntry instanceof NormalArrayEntry) {
                                            NormalArrayEntry arrayEntry = (NormalArrayEntry) variableEntry;
                                            System.out.println("Variable: " + arrayEntry.getName() + ", Tipo: " + arrayEntry.getElementType() + ", Tamaño: " + arrayEntry.getDimensions()[0]);
                                        } else if (variableEntry instanceof BidimensionalArrayEntry) {
                                            BidimensionalArrayEntry arrayEntry = (BidimensionalArrayEntry) variableEntry;
                                            System.out.println("Variable: " + arrayEntry.getName() + ", Tipo: " + arrayEntry.getElementType() + ", Tamaño: " + arrayEntry.getDimensions()[0] + "x" + arrayEntry.getDimensions()[1]);
                                        } else {
                                            System.err.println("Tipo desconocido para la variable: " + variableName);
                                        }
                                    }

                                }
                                break;
                            } else {
                                System.out.println("La extensión del archivo no es válida.");
                                break;
                            }
                        } else break;

                    case 2:
                        finalizar = true;
                        break;

                    default:
                        System.out.println("\nOpción no válida");
                        break;
                }
            }
            scanner.close();
            System.out.println("\nPrograma Finalizado");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error al leer el archivo Mini-Pascal: " + e.getMessage());
        }
    }
}