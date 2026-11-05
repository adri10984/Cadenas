public class Parentesis {
    public static void main(String[] args) {
        String frase = "Esto (es (un ejemplo) (de) una (cadena bien parentizada)";
        String[] cadenas = frase.split("\\s+");
        int contador = 0;

        for (int i=0; i<cadenas.length; i++){
            if (cadenas[i].charAt(0) == '('){
                contador++;
            }
            if (cadenas[i].charAt(cadenas[i].length()-1) == ')'){
                contador--;
            }
        }
        if (contador == 0){
            System.out.println("La frase está bien");
        } else {
            System.out.println("La frase está mal");
        }
    }
}
