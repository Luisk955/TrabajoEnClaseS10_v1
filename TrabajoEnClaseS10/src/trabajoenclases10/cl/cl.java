package trabajoenclases10.cl;

import java.util.ArrayList;

public class cl {

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    ArrayList<Motor> motores = new ArrayList<>();
    
    
    public void agregarVehiculo(Vehiculo miVehiculo){
        if(!vehiculos.contains(miVehiculo)){
            vehiculos.add(miVehiculo);
        }
    }
    public ArrayList listarVehiculos(){
        return vehiculos;
    }
    
    public void agregarMotor(Motor miMotor){
        if(!motores.contains(miMotor)){
            motores.add(miMotor);
        }
    }
    public ArrayList listarMotores(){
        return motores;
    }
}
