package Interpreter;

public class EntryConst extends SymbolEntry {
    private String name;
    private String type;

    public EntryConst(String name, String type, int ambit) {
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
