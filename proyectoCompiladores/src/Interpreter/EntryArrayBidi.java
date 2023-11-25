package Interpreter;

public class EntryArrayBidi extends SymbolEntry {
    private String name;
    private String type;
    private int limiteInferior1;
    private int limiteSuperior1;
    private int limiteInferior2;
    private int limiteSuperior2;

    public EntryArrayBidi(String name, String type, int limiteInferior1, int limiteSuperior1, int limiteInferior2, int limiteSuperior2, int ambit) {
        super(ambit);
        this.name = name;
        this.type = type;
        this.limiteInferior1 = limiteInferior1;
        this.limiteSuperior1 = limiteSuperior1;
        this.limiteInferior2 = limiteInferior2;
        this.limiteSuperior2 = limiteSuperior2;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLimiteInferior1(){return limiteInferior1;}

    public int getLimiteSuperior1(){return limiteSuperior1;}

    public int getLimiteInferior2(){return limiteInferior2;}

    public int getLimiteSuperior2(){return limiteSuperior2;}
}
