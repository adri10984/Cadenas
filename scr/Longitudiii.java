public class Longitudiii {
    public static void main(String[] args) {
        String frase = "Hola cómo estás hoy";
        int longitud = 5;
        boolean sonCortas = true;
        String[] cadena = frase.split("\\s+");
        for (int i = 0; i<cadena.length; i++){
            if (cadena[i].length() >= longitud){
                sonCortas = false;
            }
        }
        if (sonCortas){
            System.out.println("Todas las cadenas son cortas");
        }else {
            System.out.println("Hay alguna cadena larga");
        }
    }
}
