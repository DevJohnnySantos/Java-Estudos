package entidade;

public class TerFuncionario extends Funcionarios{

    private  Double adicional;

public TerFuncionario(){
    super();

}
    public TerFuncionario(String nome, Integer horas, Double vHora, Double adicional) {
        super(nome, horas, vHora);
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }
    @Override
    public double pagamento(){
    return super.pagamento() + adicional *1.1;
    }
}
