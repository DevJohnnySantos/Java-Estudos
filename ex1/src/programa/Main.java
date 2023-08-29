package programa;
import entidade.Empresa;
import entidade.Individual;
import entidade.Taxas;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Taxas> tx = new ArrayList<>();

        System.out.println("Entre com os dados: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("contribuinte #" + i + " data:");
            System.out.print("Idividual ou Empresa (i/e)? ");
            char type = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Gasto anual: ");
            double gastoA = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Gasto com saude : ");
                double gastoS = sc.nextDouble();
                tx.add(new Individual(nome, gastoA, gastoS));
            }
            else {
                System.out.print("Numero de funcionarios: ");
                int numberOfEmployees = sc.nextInt();
                tx.add(new Empresa(nome, gastoA, numberOfEmployees));
            }

        }

        double soma = 0.0;
        System.out.println();
        System.out.println("Taxas a pagar :");
        for (Taxas tp : tx) {
            double tax = tp.taxa();
            System.out.println(tp.getNome() + ": $ " + String.format("%.2f", tax));
            soma += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXAS: $ " + String.format("%.2f", soma));

    sc.close();
    }
}