package entidade;

public class Funcionarios {
    private String nome;
    private Integer horas;
    private Double vHora;
    public Funcionarios(){

    }
    public Funcionarios (String nome, Integer horas, Double vHora){
        this.nome = nome;
        this.horas = horas;
        this.vHora = vHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getvHora() {
        return vHora;
    }

    public void setvHora(Double vHora) {
        this.vHora = vHora;
    }
    public  double pagamento(){
        return horas * vHora;

    }
}
