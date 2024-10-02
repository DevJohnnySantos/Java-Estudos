package online;

import DadosContrato.Contrato;
import DadosContrato.Parcelas;

import java.time.LocalDate;

public class RegraContrato {

    private CalculoJurosTaxas calculoJurosTaxas;

    public RegraContrato (CalculoJurosTaxas calculoJurosTaxas){
        this.calculoJurosTaxas = calculoJurosTaxas;
    }
    public void CalculoParcelas(Contrato contrato, int mes){

        double base = contrato.getValorContrato() / mes;

        for (int i = 1; i <= mes; i++){
            LocalDate dataContrato  = contrato.getDataContrato().plusMonths(i);

            double juros = calculoJurosTaxas.juros(base, i);

            double taxas = calculoJurosTaxas.taxas(base + juros);

            double somaTaxaJuros = base + juros + taxas;

            contrato.getParcelas().add(new Parcelas(dataContrato, somaTaxaJuros));

        }
    }


}
