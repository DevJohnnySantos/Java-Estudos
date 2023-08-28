package aplicacao;

import entidade.Funcionarios;
import entidade.TerFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionarios> list = new ArrayList<>();

        System.out.println("Quantos funcionarios? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Dados do funcionario #" + i );
            System.out.print("Funcionario tercerizado? (s/n)");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.println("Valor por hora: ");
            double valorHora = sc.nextDouble();
            if (ch == 's') {
                System.out.println("Taxa adicional: ");
                double taxaAdicional = sc.nextDouble();

                // Funcionarios fun = new TerFuncionario(nome, horas, valorHora, taxaAdicional);
                list.add(new TerFuncionario(nome, horas, valorHora, taxaAdicional));
            } else {
                // Funcionarios fun = new Funcionarios(nome, horas,valorHora);
                list.add(new Funcionarios(nome, horas, valorHora));
            }
        }
        System.out.println();
        System.out.println("Pagamento: ");
        for (Funcionarios fun : list) {
            System.out.println(fun.getNome() + " - $" + String.format("%.2f",fun.pagamento()));
            sc.close();
        }
    }
}