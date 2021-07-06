import java.util.Scanner;

public class TrabajoPractico {

    public static void main (String [ ] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Ingrese su Edad: ");
        int edad = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese su Hobbie: ");
        String hobbie = entrada.nextLine();
        System.out.print("Ingrese su editor de codigo favorito: ");
        String editor = entrada.nextLine();
        System.out.print("Ingrese Sistema Operativo que utiliza: ");
        String sistemaOp = entrada.nextLine();



        System.out.println("El nombre del usuario es: " + nombre);
        System.out.println("El apellido del usuario es: " + apellido);
        System.out.println("La del usuario es: " + edad);
        System.out.println("El Hobbie del usuario es: " + hobbie);
        System.out.println("El editor del usuario es: " + editor);
        System.out.println("El sistema operativo que utiliza el usuario es: " + sistemaOp);
    }
}
