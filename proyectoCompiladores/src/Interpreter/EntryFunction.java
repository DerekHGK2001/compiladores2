package Interpreter;

import java.util.ArrayList;
import java.util.Map;

public class EntryFunction extends SymbolEntry {
    private String name;
    private String type;
    private ArrayList<Map<String, Object>> parameters;

    public EntryFunction(String name, String type, int ambit) {
        super(ambit);
        this.name = name;
        this.type = type;
        this.parameters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public ArrayList<Map<String, Object>> getParameters() {
        return parameters;
    }
    public void addParameter(Map<String, Object> parameterType) {
        parameters.add(parameterType);
    }

    // En tu clase EntryFunction
    public void printParameters() {
        if (parameters != null && !parameters.isEmpty()) {
            System.out.print("Parámetros: ");
            for (Map<String, Object> parameter : parameters) {
                for (Map.Entry<String, Object> entry : parameter.entrySet()) {
                    System.out.print(entry.getKey() + ": " + entry.getValue() + ", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("La función no tiene parámetros.");
        }
    }

}