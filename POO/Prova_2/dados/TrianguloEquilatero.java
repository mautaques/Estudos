package dados;

import java.lang.Math;

public class TrianguloEquilatero extends FormaGeometrica{

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

    public void setLado(float l) {
        this.lado = lado;
    }

    public TrianguloEquilatero(float x, float y, float l) {
        this.x = x;
        this.y = y;
        this.lado = lado;
    }

    public float calculaPerimetro() {
        return (float) 3 * lado;
    }

    public float calculaArea() {
        return (float)(Math.sqrt(3) * Math.pow(lado,2)) / 4;
    }
}
