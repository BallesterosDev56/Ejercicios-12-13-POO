package programacion_estructurada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ladoA;
        double ladoB;

        System.out.println("Ingresa el lado A: ");
        ladoA = input.nextDouble();

        System.out.println("Ingresa el lado B: ");
        ladoB = input.nextDouble();

        System.out.println("El area de la cancha es de: " + (ladoA*ladoB));
    }
}