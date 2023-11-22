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

}