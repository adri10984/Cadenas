public class Numeros {
    public static void main(String[] args) {
        String cadena = "237 78a 812 abd";
        String[] palabras = cadena.split("\\s+");
        boolean esNumero;
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
             esNumero = true;
            for (int j = 0; j <= palabras[i].length() - 1; j++) {
                if (!Character.isDigit(palabras[i].charAt(j))) {
                    esNumero = false;
                    break;
                }
            }
            if (esNumero) {
                contador++;
            }
        }

        System.out.println(contador);

    }
}
