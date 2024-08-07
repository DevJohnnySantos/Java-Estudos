import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a marca do carro? ");
        String marca = sc.nextLine();
        System.out.println("Qual o Nome do carro ");
        String nome = sc.nextLine();
        System.out.println("Qual o ano do carro? ");
        int ano = sc.nextInt();
        System.out.println("Qual numero do chassi do carro? ");
        int chassi = sc.nextInt();
        System.out.println("Qual a cor do carro?");
        String cor = sc.next();
        Carro carro= new Carro(marca, nome, ano, chassi, cor);
        System.out.println(" Infomações do carro " + carro.toString());


sc.close();
    }
}