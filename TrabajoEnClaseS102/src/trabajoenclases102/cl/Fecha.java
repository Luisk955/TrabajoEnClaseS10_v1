package trabajoenclases102.cl;

public class Fecha {

    private int dia;
    private int mes;
    private int anno;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    @Override
    public String toString() {
        String msg;
        msg = dia + "/" + mes + "/" + anno;
        return msg;
    }
}
