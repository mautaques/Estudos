package dados;

import java.lang.Math;

public class Quadrado extends Quadrilatero{

    private float x;
    private float y;
    private float lado;

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

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public Quadrado(float x, float y, float l1, float l2, float l3, float l4, float x1, float y1, float lado) {
        super(x, y, l1, l2, l3, l4);
        this.x = x1;
        this.y = y1;
        this.lado = lado;
    }

    public float calculaArea() {
        return (float) Math.pow(lado,2);
    }

    public float calculaPerimetro() {
        return 4 * lado;
    }

}
