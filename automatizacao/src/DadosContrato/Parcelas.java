package DadosContrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {

    private static DateTimeFormatter frt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate vencData;
    private double quantidade;

    public Parcelas(){

    }
    public Parcelas(LocalDate vencData, double quantidade){
        this.vencData = vencData;
        this.quantidade = quantidade;
    }

    public LocalDate getVencData(){
        return vencData;
    }
    public double getQuantidade(){
        return quantidade;
    }

    public void setVencData(LocalDate vencData){
        this.vencData = vencData;
    }

    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return vencData.format(frt) + " - " + String.format("%.2f", quantidade);
    }



}


