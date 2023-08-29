package estrutura;

import estrutura.enuns.Cores;

public class Circulo extends Shape {
    private Double raio;

    public Circulo (){
        super();
    }

    public Circulo (Cores cores, Double raio ){
        super(cores);
        this.raio = raio;
    }



    @Override
    public Double area() {
        return Math.PI * raio * raio ;
    }
}
