package Interpreter;

import java.util.ArrayList;

public class EntryFunction extends SymbolEntry {
    private String name;
    private String type;
    private ArrayList<String> parameters;

    public EntryFunction(String name, String type, ArrayList<String> parameters, int ambit) {
        super(ambit);
        this.name = name;
        this.type = type;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }
}