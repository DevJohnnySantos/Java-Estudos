package estrutura;

import estrutura.enuns.Cores;

public class Retangulo extends  Shape{
    private Double altura;
    private Double base;

    public Retangulo(){
        super();
    }
    public Retangulo(Cores cores, Double altura, Double base){
        super(cores);
        this.altura = altura;
        this.base = base;
    }
    @Override
    public Double area() {
        return base * altura;
    }
}
