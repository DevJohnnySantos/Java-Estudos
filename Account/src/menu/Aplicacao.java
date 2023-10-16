package menu;

import exceptions.BusinessException;
import funcoes.Cliente;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta! ");
        System.out.print("Numero da conta: ");
        int num = sc.nextInt();
        System.out.print("Nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double LimSaque =sc.nextDouble();
        Cliente cliente = new Cliente(num, titular, saldo, LimSaque);

        System.out.println();
        System.out.println("Imoforme uma quantia para sacara: ");
        double quantidade = sc.nextDouble();

        try{
            cliente.saque(quantidade);
            System.out.printf("Novo saldo: %.2f%n", cliente.getSaldo());
        }
        catch (BusinessException e){
            System.out.println(e.getMessage());
        }
    }
}
