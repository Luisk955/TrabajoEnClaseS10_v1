package trabajoenclases103.cl;

public class Rectangulo extends Figura {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        this.setArea(base * altura);
        return getArea();
    }

    @Override
    public double calcularPerimetro() {
        this.setPerimetro(base + base + altura + altura);
        return getPerimetro();
    }
}
