import java.util.Scanner;

public class Veterinaria {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean saludable;

    // Constructor vacio
    public Veterinaria() {
    }

    //Constructor con todos los parametros

    public Veterinaria(String nombre, String especie, int edad, double peso, boolean saludable) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.saludable = saludable;
    }

    //GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    // TO STRING

    @Override
    public String toString() {
        return "Veterinaria{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", saludable=" + saludable +
                '}';
    }

    //Metodos propios

    public void cumplirAnios(int anos){
        System.out.println("¿Cuantos años cumple?");
        System.out.println("Años cumplidos: " + anos);
    }

    public void engordar(){

    }

    public void adelgazar(){

    }

    public void enfermar(){

    }

    public void mostrarFicha(){
        System.out.println("Ficha mascota");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Especie: " + this.getEspecie());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Peso: " + this.getPeso() + " Kg");
        System.out.println("Saludable: " + this.isSaludable());
    }
}
