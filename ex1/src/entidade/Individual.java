package entidade;

public class Individual extends Taxas {
    private Double gastoSaude;

    public Individual(){
        super();
    }
    public Individual(String nome, Double gastoAnual, Double gastoSaude){
        super(nome, gastoAnual);
        this.gastoSaude = gastoAnual;
    }



    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }
    @Override
    public Double taxa(){
        if (getGastoAnual() < 20000.0){
            return getGastoAnual() * 0.15 - gastoSaude * 0.5;
        }
        else {
            return getGastoAnual()* 0.25 - gastoSaude *0.5;
        }
    }
}
