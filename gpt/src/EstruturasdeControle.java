import java.util.Locale;
import java.util.Scanner;

public class EstruturasdeControle {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a sua idade: ");
       int id = sc.nextInt();


        if (id < 18){
            System.out.println("Menor de idade! ");


        }
        else if (id >= 65)
            System.out.println("Idoso!");
        else
            System.out.println("Adulto!");



        sc.close();
    }
}
