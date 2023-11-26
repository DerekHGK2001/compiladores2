package Interpreter;

public class EntryArrayBidi extends SymbolEntry {
    private String name;
    private String type;
    private int limiteInferiorFilas;
    private int limiteSuperiorFilas;
    private int limiteInferiorColumnas;
    private int limiteSuperiorColumnas;

    public EntryArrayBidi(String name, String type, int limiteInferiorFilas, int limiteSuperiorFilas, int limiteInferiorColumnas, int limiteSuperiorColumnas, int ambit) {
        super(ambit);
        this.name = name;
        this.type = type;
        this.limiteInferiorFilas = limiteInferiorFilas;
        this.limiteSuperiorFilas = limiteSuperiorFilas;
        this.limiteInferiorColumnas = limiteInferiorColumnas;
        this.limiteSuperiorColumnas = limiteSuperiorColumnas;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLimiteInferiorFilas(){return limiteInferiorFilas;}

    public int getLimiteSuperiorFilas(){return limiteSuperiorFilas;}

    public int getLimiteInferiorColumnas(){return limiteInferiorColumnas;}

    public int getLimiteSuperiorColumnas(){return limiteSuperiorColumnas;}
}
