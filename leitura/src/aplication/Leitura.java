package aplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Leitura {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\out.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine());
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        //fechar o scnner sem erro
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}