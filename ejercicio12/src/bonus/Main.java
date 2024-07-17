package bonus;

import java.util.Scanner;

    class Numeros {
    static Scanner input = new Scanner(System.in);

    //inicializacion de variables para guardar datos y el contador:
    int numero;
    int i, neg=0,par=0;

    public void entrada() {

        //bulce que cuenta cuantos numero pares o negativos hay:
        for (i = 0; i < 5; i++) {
            numero = ingresarDatos("digite 1 numero");
            if (numero % 2 == 0) {
                par++;
            }
            if (numero < 0) {
                neg++;
            }
        }
        System.out.println("El numero de pares es de: " + par+ "\n" +
                "El numero de negativos es de: " + neg);
    }

    private static int ingresarDatos(String s) {
        String cadena;
        int valor;

        System.out.println(s);
        cadena = input.next();
        valor = Integer.parseInt(cadena);

        return valor;
    }
}
