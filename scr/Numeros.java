public class Numeros {
    public static void main(String[] args) {
        String cadena = "237 78a 812 abd";
        String[] palabras = cadena.split("\\s+"); //PASO LA CADENA A ARRAY
        boolean esNumero;
        int contador = 0;


        for (int i = 0; i < palabras.length; i++) { //RECORRO ARRAY
             esNumero = true;
            for (int j = 0; j <= palabras[i].length() - 1; j++) { //RECORRO CADA PALABRA DEL ARRAY
                if (!Character.isDigit(palabras[i].charAt(j))) {
                    esNumero = false; //SI NO ES NÚMERO EL BOOLEAN PASA A FALSO
                    break;
                }
            }
            if (esNumero) {
                contador++; // SI LO ES LO CEUNTA
            }
        }

        System.out.println(contador);

    }
}
