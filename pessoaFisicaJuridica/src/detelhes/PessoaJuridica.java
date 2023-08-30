package detelhes;

public class PessoaJuridica extends  Contribuintes{
    private Integer funcionarios;
    public PessoaJuridica(){
        super();
    }
    public PessoaJuridica(String nome, Double gastoAnual,Integer funcionarios ){
        super(nome, gastoAnual);
        this.funcionarios = funcionarios;
    }

    public Integer getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Integer funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public Double taxa() {
        if (funcionarios > 10){
            return getGastosAnual() * 0.14;
        }
        else {
            return getGastosAnual() * 0.16;
        }

    }
}
