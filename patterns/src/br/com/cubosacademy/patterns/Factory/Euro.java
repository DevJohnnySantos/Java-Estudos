package br.com.cubosacademy.patterns.Factory;

public class Euro implements Moeda{
    @Override
    public String getPrefixo() {
        return "€";
    }
}
