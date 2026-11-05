import java.util.Scanner;

public class Invertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = sc.nextLine();
        String cadena[] = frase.split("\\s+");

        for(int i = cadena.length - 1; i >= 0; i--){
            System.out.print(cadena[i] + " ");
        }

    }
}
