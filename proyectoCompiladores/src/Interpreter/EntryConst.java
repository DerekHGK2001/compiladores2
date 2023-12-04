package Interpreter;

public class EntryConst extends SymbolEntry {
    private String name;
    private String type;
    private int value;

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

    public void setValue(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
