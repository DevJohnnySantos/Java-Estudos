import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matriz = {
                {"AdalbertoFerreira", "1091982", "Contabilidade", "(21)99281-2983"},
                {"AdalbertoFerreira", "1091982", "Contabilidade", "(21)99281-2983"},
                {"AdalbertoFerreira", "1091982", "Contabilidade", "(21)99281-2983"},

        };

        // imprimindo a matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Nome: " + matriz[i][0] + ", id: " + matriz[i][1] + ", cargo: " + matriz[i][2] + ", numero  cel: " + matriz[i][3]);
        }
    }

    }
