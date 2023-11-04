package Interpreter;

public class EntryConst extends SymbolEntry {
    private String name;

    public EntryConst(String name, int ambit) {
        super(ambit);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
