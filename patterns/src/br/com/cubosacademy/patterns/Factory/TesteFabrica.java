package br.com.cubosacademy.patterns.Factory;

public class TesteFabrica {
    public static void main(String[] args) throws IllegalAccessException {
        Moeda moeda = MoedaFabrica.getInstance("EUA");
        System.out.println(moeda.getPrefixo());
    }
}
