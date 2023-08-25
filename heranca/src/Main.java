import entidade.Conta;
import entidade.ContaPj;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(01,"alex", 2700.0);
        c1.saque(200.0);
        System.out.println("Saldo em conta: " + c1.getSaldo());

        Conta c2 = new Conta(02,"alex", 4500.0);
        c1.saque(500.0);
        System.out.println("Saldo em conta: " + c2.getSaldo());


        Conta c3 = new Conta(03,"jao", 5000.0);
        c1.saque(1200.0);
        System.out.println("Saldo em conta: " + c3.getSaldo());

    }
}