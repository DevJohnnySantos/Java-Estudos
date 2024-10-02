package online;



public class RegraJurosTaxas implements CalculoJurosTaxas{
    private static final double TAXAS_CONTRATO = 0.02;
    public static final double JUROS_CONTRATO = 0.01;
    @Override
    public double taxas(double valor) {
        return valor * TAXAS_CONTRATO;
    }

    @Override
    public double juros(double valor, int mes) {
        return valor * JUROS_CONTRATO * mes;
    }
}
