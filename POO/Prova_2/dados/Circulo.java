package dados;

import java.lang.Math;
public class Circulo extends FormaGeometrica{

    private float x;
    private float y;
    private float raio;

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

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public Circulo(float x, float y, float raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public float calculaPerimetro() {
        return (float)(3.14159227 * Math.pow(raio,2));
    }

    public float calculaArea() {
        return (float)(2 * 3.14159227 * raio);
    }

}
