package Interpreter;

public class EntryArray extends SymbolEntry{
    private String name;
    private String type;

    public EntryArray(String name, String type, int ambit) {
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

