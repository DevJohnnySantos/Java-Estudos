package entidade;

public abstract class Taxas {
    private  String nome;
    private  Double gastoAnual;

    public  Taxas(){

    }
    public Taxas(String nome, Double gastoAnual){
        this.nome = nome;
        this.gastoAnual = gastoAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGastoAnual() {
        return gastoAnual;
    }

    public void setGastoAnual(Double gastoAnual) {
        this.gastoAnual = gastoAnual;
    }

    public abstract Double taxa();

}
