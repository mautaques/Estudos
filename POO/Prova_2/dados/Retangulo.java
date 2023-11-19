package dados;

public class Retangulo extends Quadrilatero{

    private float x;
    private float y;
    private float base;
    private float altura;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Retangulo(float x, float y, float l1, float l2, float l3, float l4, float x1, float y1, float base, float altura) {
        super(x, y, l1, l2, l3, l4);
        this.x = x1;
        this.y = y1;
        this.base = base;
        this.altura = altura;
    }

    public float calculaArea() {
        return base * altura;
    }

    public float calculaPerimetro() {
        return 2 * base + 2 * altura;
    }
}
