import java.util.Locale;

public class Pasatiempos {
    public static void main(String[] args) {
        String frase = "Un ejemplo de pasatiempos";
        String fraseNueva = "";
        for (int i = 0; i <= frase.length() - 1; i++) {
            if ("aeiou".contains("" + frase.toLowerCase().charAt(i))) {
                fraseNueva = fraseNueva + ".";
            } else  {
                fraseNueva = fraseNueva + frase.charAt(i);
            }
        }
        System.out.println(fraseNueva);
    }
}
