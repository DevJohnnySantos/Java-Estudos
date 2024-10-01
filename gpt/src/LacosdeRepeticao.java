import java.util.Locale;
import java.util.Scanner;

public class LacosdeRepeticao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Diite o  valor de num: ");
        int num = sc.nextInt();



        if (num == 0){
            System.out.print("Informe um valor maior que zero!" );
        }

        else{
            int a = 0, b = 1, c;

        System.out.print("Sequencia de Fibonacci: " + a);


        if (num > 1){
            System.out.print(", "+ b );
        }

        for (int i =2; i <= num; i++){
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }

        System.out.println();

        sc.close();
    }
}
}
