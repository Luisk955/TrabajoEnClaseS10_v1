package trabajoenclases10.gestor;

import java.util.ArrayList;
import trabajoenclases10.cl.*;

public class Gestor {

    cl logic = new cl();

    public void registrarVehiculo(String mNumSerie, String mMarca) {
        Vehiculo miVehiculo = new Vehiculo(mNumSerie, mMarca);
    }

    public void registrarVehiculo(String mNumSerie, String mMarca, Motor mMotor) {
        Vehiculo miVehiculo = new Vehiculo(mNumSerie, mMarca, mMotor);
    }

    public ArrayList<String> listarVehiculos() {
        ArrayList<String> listaVehiculos = new ArrayList<>();
        ArrayList<Vehiculo> listaVehiculosV = logic.listarVehiculos();
        for (Vehiculo miVehiculo : listaVehiculosV) {
            listaVehiculos.add(miVehiculo.toString());
        }
        return listaVehiculos;
    }

    public void registrarMotor(String numSerie, int cilindraje) {
        Motor miMotor = new Motor(numSerie, cilindraje);
    }

    public ArrayList<String> listarMotores() {
        ArrayList<String> listaMotores = new ArrayList<>();
        ArrayList<Motor> listaMotoresM = logic.listarMotores();
        for (Motor miMotor : listaMotoresM) {
            listaMotores.add(miMotor.toString());
        }
        return listaMotores;
    }

    public ArrayList<Motor> listarMotoresIn() {

        return logic.listarMotores();

    }
}
