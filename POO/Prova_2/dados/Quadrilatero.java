package dados;

public abstract class Quadrilatero extends FormaGeometrica{

    private float x;
    private float y;
    private float l1;
    private float l2;
    private float l3;
    private float l4;

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

    public float getL1() {
        return l1;
    }

    public void setL1(float l1) {
        this.l1 = l1;
    }

    public float getL2() {
        return l2;
    }

    public void setL2(float l2) {
        this.l2 = l2;
    }

    public float getL3() {
        return l3;
    }

    public void setL3(float l3) {
        this.l3 = l3;
    }

    public float getL4() {
        return l4;
    }

    public void setL4(float l4) {
        this.l4 = l4;
    }

    public Quadrilatero(float x, float y, float l1, float l2, float l3, float l4) {
        this.x = x;
        this.y = y;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }
}
