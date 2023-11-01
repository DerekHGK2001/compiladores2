package Interpreter;

public class NormalArrayEntry extends ArrayEntry {
    public NormalArrayEntry(String name, String elementType, int dimensions) {
        super(name, elementType, new int[]{dimensions});
    }
}