import java.util.Scanner;

public class Flecha {
    Scanner input = new Scanner(System.in);
    int longitud;
    String color;


    public Flecha() {
        longitud = 18;
        color = "negro";
    }
    public Flecha(int longitud, String color) {
        this.longitud = longitud;
        this.color = color;
    }

    public void construirFlecha() {
        for (int i = 0; i < longitud; i++) {
            imprime("-");
        }
        imprime(">");
    }

    public void imprimirEspacio() {
        System.out.print("\n");
    }

    private void imprime(String simbolo) {
        if (color.equals("negro")) {
            System.out.print(simbolo);
        } else {
            System.err.print(simbolo);
        }
    }

    public void pedirDatos() {
        String color;
        int longitud;

        do {
            System.out.println("Ingresa el color de la flecha: (negro, rojo)");
            color = input.next();
            if (!(color.equals("negro") || color.equals("rojo"))) {
                System.out.println("Ingresa un color dentro de las opciones.\n");
            }
        } while(!(color.equals("negro") || color.equals("rojo")));

        do {
            System.out.println("Ingresa la longitud de la flecha: ");
            longitud = input.nextInt();
            if (longitud < 0) {
                System.out.println("No se permiten valores negativos.");
            }
        } while (longitud < 0);

        this.color = color;
        this.longitud = longitud;
    }
}
