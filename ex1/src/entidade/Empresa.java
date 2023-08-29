package entidade;

public class Empresa extends Taxas{
    private Integer numeroDeFuncionarios;

    public Empresa(String nome, Double gastoAnual, Integer numeroDeFuncionarios){
        super(nome, gastoAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
    @Override
    public Double taxa(){
        if (numeroDeFuncionarios >10){
            return getGastoAnual() *0.14;
        }
        else {
            return getGastoAnual() *0.16;
        }
    }
}
