package trabajoenclases103.cl;

public class Cuadrado extends Figura {

    private int ancho;
    private int alto;

    public Cuadrado() {
        super();
    }

    public Cuadrado(int ancho, int alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        this.setArea(alto * ancho);
        return getArea();
    }

    @Override
    public double calcularPerimetro() {
        this.setPerimetro(alto + alto + ancho + ancho);
        return getPerimetro();
    }
}
