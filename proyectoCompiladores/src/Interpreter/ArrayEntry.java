package Interpreter;

public class ArrayEntry {
    private String name;
    private String elementType;
    private int[] dimensions;

    public ArrayEntry(String name, String elementType, int[] dimensions) {
        this.name = name;
        this.elementType = elementType;
        this.dimensions = dimensions;
    }

    public String getName() {
        return name;
    }

    public String getElementType() {
        return elementType;
    }

    public int[] getDimensions() {
        return dimensions;
    }
}