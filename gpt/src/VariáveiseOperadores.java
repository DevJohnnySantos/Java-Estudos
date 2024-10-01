import java.util.Locale;
import java.util.Scanner;

public class VariáveiseOperadores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;



        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();

        int soma = num1 + num2;
        int subitracao = num1 - num2;
        double divisao = (num2 != 0)? (double) num1 / num2 : 0;

        int multiplica = num1 * num2;

        System.out.println("Soma " +soma);
        System.out.println("Subitração " +subitracao);
        System.out.println("Multiplicação " +multiplica);
        if (num2 !=0){
            System.out.printf("Divisão %.0f", divisao);

        }
        else System.out.println("Erro: Divisão por zero não permitida");




       sc.close();
    }
}