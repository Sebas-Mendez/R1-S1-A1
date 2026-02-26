import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Veterinaria A1 = new Veterinaria("Lara" , "Cocker Spaniel" , 8 , 12.2 , true);
        A1.mostrarFicha();



    }
}