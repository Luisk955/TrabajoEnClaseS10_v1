package trabajoenclases102.cl;

public class Linea {

    private int cantidad;
    private String codigo;
    private String descripcion;
    private double precio;

    public Linea() {
    }

    public Linea(int cantidad, String codigo, String descripcion, double precio) {
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularCosto() {
        return (cantidad * precio);
    }

    @Override
    /* Version en texto con todos los datos de la linea */
    public String toString() {
        String msg;
        msg = cantidad + "\t";
        msg = msg + codigo + "\t";
        msg = msg + descripcion + "\t";
        msg = msg + precio + "\t";
        msg = msg + calcularCosto();
        return msg;
    }

}
