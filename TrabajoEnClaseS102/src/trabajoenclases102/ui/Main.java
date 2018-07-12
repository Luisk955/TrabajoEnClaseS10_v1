package trabajoenclases102.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import trabajoenclases102.cl.*;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
//        int opcion = 0;
//        boolean salir = true;
//
//        do {
//            mostrarMenu();
//            opcion = leerOpcionDelMenu();
//            salir = ejecutarAccionDelMenu(opcion);
//        } while (salir == false);

        Factura factura;
        factura = new Factura("0065433", "Juan Perez", 12, 5, 2002);
        factura.agregarLinea(2, "3702", "camisas", 5300);
        factura.agregarLinea(1, "2805","cepillo",8200);
        factura.agregarLinea(1, "1531", "corbata", 4100);
        System.out.println("Total: " + factura.calcularTotal());
        System.out.println(factura.toString());
    }

    static void mostrarMenu() {
        System.out.println("");
        System.out.println("1.Ventanilla");
    }

    static int leerOpcionDelMenu() throws IOException {
        int opcion = 0;
        System.out.println("Ingrese una opcion");
        opcion = Integer.parseInt(in.readLine());
        return opcion;
    }

    private static boolean ejecutarAccionDelMenu(int opcion) throws IOException {
        boolean salir = false;
        switch (opcion) {
            case 1:

                break;
        }

        return salir;
    }

}
