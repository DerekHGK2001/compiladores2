package Interpreter;

class SymbolEntry {
    private int ambit;

    public SymbolEntry(int ambit) {
        this.ambit = ambit;
    }

    public int getAmbit() {
        return ambit;
    }
}

public class EntryVariable extends SymbolEntry {
    private String name;
    private String type;

    public EntryVariable(String name, String type, int ambit) {
        super(ambit);
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

