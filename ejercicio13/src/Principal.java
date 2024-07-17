
public class Principal {
    Flecha flecha1, flecha2, flecha3;

    public static void main (String []args) {
        Principal miPrincipal = new Principal();

    }
    public Principal () {
//        flecha1 = new Flecha();
//        flecha1.construirFlecha();
//        flecha1.imprimirEspacio();
//
//        flecha2 = new Flecha();
//        flecha2.color = "negro";
//        flecha2.longitud = 8;
//        flecha2.construirFlecha();
//        flecha2.imprimirEspacio();
//
//        flecha3 = new Flecha(15, "rojo");
//        flecha3.construirFlecha();
//        flecha3.imprimirEspacio();
        Flecha flechaEjemplo = new Flecha();
        flechaEjemplo.pedirDatos();
        flechaEjemplo.construirFlecha();
    }
}
