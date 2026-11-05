public class Alfabetica {
    public static void main(String[] args) {
        String palabra = "amor";
        boolean alfabetico = true;


        for(int i = 0; i < palabra.length() - 1; i++){
            if (palabra.charAt(i) > palabra.charAt(i + 1)){
                alfabetico = false;
                break;
            }
        }
        if(alfabetico){
            System.out.println("Palabra en orden alfabético");
        } else {
            System.out.println("La palabra no está en orden alfabético");
        }
    }
}
