package trabajoenclases103.cl;

public abstract class Figura {

    private double area;
    private double perimetro;

    public Figura() {
    }

    abstract public double calcularArea();

    abstract public double calcularPerimetro();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
