import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Veterinaria A1 = new Veterinaria("Lara" , "Cocker Spaniel" , 8 , 12.2 , true);
        A1.mostrarFicha();

        System.out.println("Elija la opcion que necesite");
        System.out.println("1. Edad");
        System.out.println("2. Peso");
        System.out.println("3. estado de salud");

        switch (teclado.nextInt()){
            case 1:
                System.out.println("¿Cuantos años cumple?");
                System.out.println(A1.cumplirAnios(teclado.nextInt()));
                A1.mostrarFicha();
                break;
            case 2:
                System.out.println("1. Engordar");
                System.out.println("2. Adelgazar");
                switch (teclado.nextInt()) {
                    case 1:
                        System.out.println("Ingrese el peso modificado");
                        System.out.println(A1.engordar(teclado.nextDouble()));
                        A1.mostrarFicha();
                        break;
                    case 2:
                        System.out.println("Ingrese el peso modificado");
                        System.out.println(A1.adelgazar(teclado.nextDouble()));
                        A1.mostrarFicha();
                        break;
                }
            case 3:
                System.out.println("Ingrese el nuevo estado de salud de la mascota");
                System.out.println("(1) saludable o (2) enfermo");
                System.out.println(A1.enfermar(teclado.nextInt()));
                A1.mostrarFicha();
                break;
            default:
                System.out.println("Opicion no reconocida");
        }






    }
}