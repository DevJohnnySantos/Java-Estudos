package detelhes;

public abstract class  Contribuintes {
    private String nome;
    private Double gastosAnual;
    public Contribuintes(){

    }
    public Contribuintes(String nome, Double gastosAnual){
        this.nome = nome;
        this.gastosAnual = gastosAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGastosAnual() {
        return gastosAnual;
    }

    public void setGastosAnual(Double gastosAnual) {
        this.gastosAnual = gastosAnual;
    }
    public abstract Double taxa();

}
