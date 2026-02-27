import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        Veterinaria A1 = new Veterinaria("Lara" , "Cocker Spaniel" , 8 , 12.2 , true);
        A1.mostrarFicha();

        List<Veterinaria> lstLista =new ArrayList<>();

        do {

            System.out.println("Elija la opcion que necesite modificar");
            System.out.println("1 Crear ficha");
            System.out.println("2. Buscar");
            System.out.println("3. Mostrar ficha");


            opcion=teclado.nextInt()  ;
            switch (opcion){
                case 1:
                    System.out.println("Sistema de creacion de ficha");
                    System.out.println("Ingrese el nombre de la mascota");
                    String name = teclado.next();
                    System.out.println("Ingrese la especie");
                    String specie = teclado.next();
                    System.out.println("Ingrese la edad de la mascota");
                    int age = teclado.nextInt();
                    System.out.println("Ingrese el peso de la mascota");
                    double kg = teclado.nextDouble();
                    System.out.println("Estado de salud de la mascota (TRUE O FALSE)");
                    boolean salud = teclado.nextBoolean();
                    Veterinaria A2 = new Veterinaria(name, specie, age, kg, salud);
                    lstLista.add(A2);
                    break;

                case 2:
                    String nombre ;
                    System.out.println("Sistema de busqueda de la mascota por nombre");
                    System.out.println("Ingrese el nombre de la mascota");
                    nombre = teclado.next();
                    if (lstLista.isEmpty()){
                        System.out.println("No hay historial");
                    }

                    Veterinaria AN1 = null;
                    for (Veterinaria p: lstLista){
                        if(p.getNombre().equalsIgnoreCase(nombre)){
                            AN1 = p;
                            System.out.println(AN1);
                        }

                    }
                    System.out.println("Elija la opcion que necesite");
                    System.out.println("1. Edad");
                    System.out.println("2. Peso");
                    System.out.println("3. estado de salud");

                    opcion=teclado.nextInt();

                    switch (opcion){
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
                    }
                    break;


                case 3:
                    for (Veterinaria pet1: lstLista){
                        System.out.println(pet1);
                    }
                    break;
                default:
                    System.out.println("Opicion no reconocida");
            }
        } while (opcion != 6);
    }






}