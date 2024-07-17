package programacion_metodos;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double ladoA;
        double ladoB;

        ladoA = ingresarDatos("Ingresa el lado A: ");
        ladoB = ingresarDatos("Ingresa el lado B: ");

        calcularArea(ladoA, ladoB);
    }

    private static void calcularArea(double ladoA, double ladoB) {
        System.out.println("El area de la cancha es de: " + (ladoA*ladoB));
    }

    private static double ingresarDatos(String message) {
        System.out.println(message);
        double dato = input.nextDouble();

        return dato;
    }
}
