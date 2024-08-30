package br.com.cubosacademy.patterns.Factory;

public class MoedaFabrica {

public static Moeda getInstance(String pais) throws IllegalAccessException {
    switch (pais){
        case "BR" : return new Real();
        case "EUA" : return new Dollar();
        case "CA" : return new Dollar();
        case "ITA" : return new Euro();
        case "RUS" : return  new Euro();
        case "ESP" : return new Euro();
        default: throw new IllegalAccessException("País não catalogado, informe um pais valido.");
    }
}
}
