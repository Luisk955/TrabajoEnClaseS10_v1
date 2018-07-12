package trabajoenclases102.cl;

import java.util.Vector;

public class Factura {

    private String mNumero;
    private String mCliente;
    private Fecha mFecha;
    private Vector mDetalle;

    public Factura() {
    }

    public Factura(String mNumero, String mCliente, int pDia, int pMes, int pAnno) {
        this.mNumero = mNumero;
        this.mCliente = mCliente;
        mFecha = new Fecha(pDia, pMes, pAnno);
        mDetalle = new Vector();
    }

    public String getmNumero() {
        return mNumero;
    }

    public void setmNumero(String mNumero) {
        this.mNumero = mNumero;
    }

    public String getmCliente() {
        return mCliente;
    }

    public void setmCliente(String mCliente) {
        this.mCliente = mCliente;
    }

    public Fecha getmFecha() {
        return mFecha;
    }

    public void setmFecha(Fecha mFecha) {
        this.mFecha = mFecha;
    }

    public Vector getmDetalle() {
        return mDetalle;
    }

    public void setmDetalle(Vector mDetalle) {
        this.mDetalle = mDetalle;
    }

    private double calcularSubtotal() {
        Linea lineaDetalle;
        double subtotal;
        subtotal = 0;
        for (int i = 0; i < mDetalle.size(); i++) {
            lineaDetalle = (Linea) mDetalle.get(i);
            subtotal = subtotal + lineaDetalle.calcularCosto();
        }
        return subtotal;
    }

    private double calcularImpuesto() {
        double impuesto;
        impuesto = calcularSubtotal() * 13 / 100;
        return impuesto;
    }

    public double calcularTotal() {
        double total;
        total = calcularSubtotal() + calcularImpuesto();
        return total;
    }

    public void agregarLinea(int pcantidad, String pcodigo, String pdescripcion, double pprecio) {
        mDetalle.add(new Linea(pcantidad, pcodigo, pdescripcion, pprecio));
    }

    @Override
    public String toString() {
        String msg;
        Linea lineaD;
        msg = "================================" + "\n";
        msg = msg + "Joyeria la Perla";
        msg = msg + "\t\t" + "No. " + mNumero + "\n";
        msg = msg + "cliente: " + mCliente + " ";
        msg = msg + "\t" + mFecha.toString() + "\n";
        msg = msg + "------------------------------------------" + "\n";
        msg = msg + "cant" + "\t" + "codigo" + "\t" + "descrip"
                + "\t" + "precio" + "\t" + "costo" + "\n";
        for (int i = 0; i < mDetalle.size(); i++) {
            lineaD = (Linea) mDetalle.get(i);
            msg = msg + lineaD.toString() + "\n";
        }
        msg = msg + "\t\t\t\t" + "----------" + "\n";
        msg = msg + "\t\t\t" + "subtotal:" + this.calcularSubtotal() + "\n";
        msg = msg + "\t\t\t" + "impuesto:" + this.calcularImpuesto() + "\n";
        msg = msg + "\t\t\t" + "total :" + this.calcularTotal() + "\n";
        msg = msg + "========================" + "\n";
        return msg;
    }

}
