package programa;

import detelhes.Contribuintes;
import detelhes.PessoaFisica;
import detelhes.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuintes> contri = new ArrayList<>();

        System.out.print("Quantos contribuintes? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++ ){
            System.out.println(i +" Contribuinte: ");
            System.out.print("Pessoa fisica ou juridica (f/j)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("gasto anual: ");
            double anualGasto = sc.nextDouble();
            if( ch == 'f'){

                System.out.print("Gastos com Saude: ");
                double saudeGastos = sc.nextDouble();
                contri.add(new PessoaFisica(nome,anualGasto,saudeGastos ));
            }
            else {
                System.out.print("Numero de funcionarios: ");
                int nFuncionarios = sc.nextInt();

                contri.add(new PessoaJuridica(nome, anualGasto,nFuncionarios));
            }

            }
        System.out.println();
        double soma =0.0;
        System.out.println("Taxas a pagar: ");
        for (Contribuintes  con : contri){
            double taxa = con.taxa();
            System.out.printf(con.getNome() + ": $ " + String.format("%.2f", con.taxa()));
            System.out.println();
            soma += taxa;



        }

        System.out.println();
        System.out.println("Total das taxas: $ " + String.format("%.2f", soma));

    sc.close();
    }
}