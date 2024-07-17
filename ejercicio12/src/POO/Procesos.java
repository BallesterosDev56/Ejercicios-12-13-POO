package POO;

import java.util.Scanner;

public class Procesos {
    static Scanner input = new Scanner(System.in);

    public void iniciar () {
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
