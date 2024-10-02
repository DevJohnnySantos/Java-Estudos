package DadosContrato;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private Integer numContrato;
    private LocalDate dataContrato;
    private Double valorContrato;
    private List<Parcelas> parcelas = new ArrayList<>();

    public Contrato(){

    }

    public Contrato(Integer numContrato, LocalDate dataContrato, Double valorContrato){
        this.numContrato = numContrato;
        this.dataContrato = dataContrato;
        this.valorContrato = valorContrato;

    }
    public Integer getNumContrato(){
        return numContrato;
    }
    public LocalDate getDataContrato(){
        return  dataContrato;
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }

    public Double getValorContrato(){
        return valorContrato;
    }
    public void setNumContrato(Integer numContrato){
        this.numContrato = numContrato;
    }
    public  void  setDataContrato (LocalDate dataContrato){
        this.dataContrato = dataContrato;
    }
    public void setValorContrato(Double valorContrato){
        this.valorContrato = valorContrato;
    }

}
