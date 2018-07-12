package trabajoenclases103.cl;

public class Triangulo extends Figura {

    private int base;
    private int altura;
    private int a;
    private int b;
    private int c;

    public Triangulo() {
        super();
    }

    public Triangulo(int base, int altura, int a, int b, int c) {
        super();
        this.base = base;
        this.altura = altura;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcularArea() {
        this.setArea((base * altura) / 2);
        return getArea();
    }

    @Override
    public double calcularPerimetro() {
        this.setPerimetro(a + b + c);
        return getPerimetro();
    }
}
