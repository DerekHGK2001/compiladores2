package Interpreter;

public class EntryConst extends SymbolEntry {
    private String name;
    private String type;

    public EntryConst(String name, int ambit) {
        super(ambit);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
