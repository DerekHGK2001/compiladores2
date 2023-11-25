package Interpreter;

public class EntryArray extends SymbolEntry {
    private String name;
    private String type;
    private int limiteInferior;
    private int limiteSuperior;

    public EntryArray(String name, String type, int limiteInferior, int limiteSuperior,int ambit) {
        super(ambit);
        this.name = name;
        this.type = type;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLimiteInferior(){return limiteInferior;}

    public int getLimiteSuperior(){return limiteSuperior;}
}
