package estrutura;

import estrutura.enuns.Cores;

public abstract class Shape {
   private Cores cor;

   public Shape(){

   }
   public Shape(Cores cor){
       this.cor = cor;
   }

    public Cores getCor() {
        return cor;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }
    public abstract Double area();
}
