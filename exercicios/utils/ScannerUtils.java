package utils;

import java.util.Scanner;

public abstract class ScannerUtils {

    public Scanner scanner = new Scanner(System.in);

    public Double getDouble(String texto) {
        print(texto);
        return scanner.nextDouble();
    }

    public Integer getInt(String texto) {
        print(texto);
        return scanner.nextInt();
    }

    public String getString(String texto) {
        print(texto);
        return scanner.next();
    }

    public static void print(String texto) {
        System.out.println(texto);
    }

}
