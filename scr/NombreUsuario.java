import java.util.Locale;
import java.util.Scanner;

public class NombreUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre y apellidos: ");
        String nombre = sc.nextLine();
        String[] partes = nombre.split("\\s+");

        //Nombre corregido
        String nombreUsuario = "";
        for(int i = 0; i < partes.length; i++){
            nombreUsuario += partes[i].substring(0, 1).toUpperCase();
            nombreUsuario += partes[i].substring(1).toLowerCase() + " ";
        }
        System.out.println("Nombre: " + nombreUsuario);

        //Iniciales
        for(int i = 0; i < partes.length; i++){
            System.out.print(partes[i].substring(0, 1).toUpperCase() + ".");
        }
        System.out.println();

        //Usuario
        String usuario = partes[0].substring(0, 1);
        usuario += partes[1];
        usuario += partes[2].substring(0, 1);
        usuario = usuario.toLowerCase();

        System.out.println("Usuario: " + usuario);


    }
}
