package aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriarTxt {
    public static void main(String[] args) {


        String[] lines = new String[]{"olá", "boa tarde", "boa noite"};
        String path = "C:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
