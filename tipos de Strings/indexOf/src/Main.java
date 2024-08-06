public class Main {
    public static void main(String[] args) {
        String texto = "Hello, world!";

        // Encontrar a posição de um caractere
        int posicaoO = texto.indexOf('o'); // retorna 4

        // Encontrar a posição de uma substring
        int posicaoWorld = texto.indexOf("world"); // retorna 7

        // Quando não encontra, retorna -1
        int posicaoJava = texto.indexOf("Java"); // retorna -1

        System.out.println("Posição do 'o': " + posicaoO); // retona 4
        System.out.println("Posição de 'world': " + posicaoWorld); // retorna 7
        System.out.println("Posição de 'Java': " + posicaoJava); // retorna -1

        // Usando diferentes sobrecargas
        int primeiraOcorrencia = texto.indexOf('o'); // retorna 4
        int segundaOcorrencia = texto.indexOf('o', 5); // retorna 8
        int ocorrenciaSubstring = texto.indexOf("Hello"); // retorna 0
        int segundaOcorrenciaSubstring = texto.indexOf("Hello", 1);

        System.out.println("Primeira ocorrência de 'o': " + primeiraOcorrencia); // retorna 4
        System.out.println("Segunda ocorrência de 'o': " + segundaOcorrencia); // retorna 8
        System.out.println("Ocorrência de 'Hello': " + ocorrenciaSubstring); // retorna 0
        System.out.println("Segunda ocorrência de 'Hello': " + segundaOcorrenciaSubstring); // retorna -1


    }
}