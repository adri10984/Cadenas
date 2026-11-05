import java.util.Locale;

public class Siglas {
    public static void main(String[] args) {
        String frase = "Escuela Oficial de Idiomas";
        String[] palabras = frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++)
            if (Character.isUpperCase(palabras[i].charAt(0))){ //Si el primero carácter es mayúscula
                System.out.print(palabras[i].charAt(0)); //Imprime el primer carácter
            }
    }
}
