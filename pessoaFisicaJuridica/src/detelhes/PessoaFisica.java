package detelhes;

public class PessoaFisica extends Contribuintes{
    private Double gastoSaude;
    public PessoaFisica(){
    super();
    }
    public PessoaFisica(String nome, Double gastoAnual, Double gastoSaude){
        super(nome, gastoAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public  Double taxa() {
        if (getGastosAnual() < 20000.0){
            return getGastosAnual() * 0.15 - gastoSaude * 0.5;
        }
        else {
            return getGastosAnual() * 0.25 - gastoSaude * 0.5;
        }
    }
}
