package trabajoenclases10.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import trabajoenclases10.gestor.Gestor;
import java.util.ArrayList;


public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Gestor ctrl = new Gestor();

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

        ctrl.registrarVehiculo("656565", "Nissan");

        for (String dato : ctrl.listarVehiculos()) {
            System.out.println(dato);

        }
        for (String dato : ctrl.listarMotores()) {
            System.out.println(dato);

        }
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
