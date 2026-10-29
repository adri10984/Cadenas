import java.util.Locale;
import java.util.Scanner;

public class Analizar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces = 0;
        System.out.println("Escribe una palabra");
        String palabra = sc.nextLine();
        System.out.println("Longitud: " + palabra.length());
        System.out.println("Primera letra: " + palabra.charAt(0));
        System.out.println("Ultima letra: " + palabra.charAt(palabra.length() - 1));
        System.out.println("Mayúsculas: " + palabra.toUpperCase());
        System.out.println("Minúsculas: " + palabra.toLowerCase());
        for (int i = 0; i <= palabra.length() - 1; i++) {
            char c = Character.toLowerCase(palabra.charAt(i));
            if ("a".indexOf(c) != -1) {
                veces++;
            }
        }
        System.out.println("Número de (a): " + veces);

    }
}



