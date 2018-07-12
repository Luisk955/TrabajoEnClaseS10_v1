package trabajoenclases10.cl;

public class Vehiculo {
    private String mNumSerie;
    private String mMarca;
    private Motor mMotor;

    public Vehiculo() {
    }

    public Vehiculo(String mNumSerie, String mMarca) {
        //Constructor que crea el motor
        this.mNumSerie = mNumSerie;
        this.mMarca = mMarca;
        mMotor = new Motor(mNumSerie, 4);
    }

    public Vehiculo(String mNumSerie, String mMarca, Motor mMotor) {
        this.mNumSerie = mNumSerie;
        this.mMarca = mMarca;
        this.mMotor = mMotor;
    }

    public String getmNumSerie() {
        return mNumSerie;
    }

    public void setmNumSerie(String mNumSerie) {
        this.mNumSerie = mNumSerie;
    }

    public String getmMarca() {
        return mMarca;
    }

    public void setmMarca(String mMarca) {
        this.mMarca = mMarca;
    }

    public Motor getmMotor() {
        return mMotor;
    }

    public void setmMotor(Motor mMotor) {
        this.mMotor = mMotor;
    }

    @Override
    public String toString() {
        return "Vehiculo: Número de serie: " + mNumSerie + ", Marca: " + mMarca + "," + mMotor.toString();
    }
}
