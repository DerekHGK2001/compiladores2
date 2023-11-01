package Interpreter;

public class SymbolEntry {
    private String name;
    private String type;

    public SymbolEntry(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
