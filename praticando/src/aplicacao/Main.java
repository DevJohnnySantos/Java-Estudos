package aplicacao;

import estrutura.Circulo;
import estrutura.Retangulo;
import estrutura.Shape;
import estrutura.enuns.Cores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.spi.LocaleServiceProvider;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> formas = new ArrayList<>();

        System.out.println("quantas formas serão calculadas? ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("informe a " + i + " forma");
            System.out.print("Retangulo ou circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Qual a cor? (vermelho/preto/azul) ");
            Cores cores = Cores.valueOf(sc.next());
            if(ch == 'r'){
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                System.out.print("Base: ");
                double base = sc.nextDouble();
                formas.add(new Retangulo(cores, altura, base));

            }
            else {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                formas.add(new Circulo(cores, raio));
            }

        }
        System.out.println();
        System.out.println("Area das formas :");
        for (Shape forma : formas) {
            System.out.printf("%.2f", forma.area());
            System.out.println();
        }


    sc.close();
    }
}