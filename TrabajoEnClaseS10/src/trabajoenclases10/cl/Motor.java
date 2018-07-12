package trabajoenclases10.cl;

public class Motor {

    private String numSerie;
    private int cilindraje;

    public Motor() {
    }

    public Motor(String numSerie, int cilindraje) {
        this.numSerie = numSerie;
        this.cilindraje = cilindraje;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Motor: Número de serie: " + numSerie + ", Cilindraje: " + cilindraje;
    }
}
