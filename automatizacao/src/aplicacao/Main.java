package aplicacao;

import DadosContrato.Contrato;
import DadosContrato.Parcelas;
import online.RegraContrato;
import online.RegraJurosTaxas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Entre com o numero do contrato: ");
        int num = sc.nextInt();
        System.out.print("Data: (dd/MM/yyyy) ");
        LocalDate date = LocalDate.parse(sc.next(),frmt);
        System.out.print("Valor do contrato: ");
        double valorTotal = sc.nextDouble();

        Contrato novoContrato = new Contrato(num, date, valorTotal);

        System.out.print("Entre com o numero de parcelas: ");
        int nParcelas = sc.nextInt();

        RegraContrato regraContrato = new RegraContrato(new RegraJurosTaxas());

        regraContrato.CalculoParcelas(novoContrato,nParcelas);

        System.out.print("Parcelas: ");
        for (Parcelas parcelas: novoContrato.getParcelas()){
            System.out.println(parcelas);
        }

    sc .close();
    }
}