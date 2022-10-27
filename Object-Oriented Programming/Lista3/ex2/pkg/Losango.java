package src.pkg;

public class Losango extends FormaGeometrica{

    public void setD(int D){
        super.valor1 = D;
    }

    public void setd(int d){
        super.valor2 = d;
    }

    public int calculaArea(){
        return (valor1 * valor2) / 2;
    }

    public int calculaPerimetro(){
        return (int) (4 * Math.sqrt(valor1 * valor1 / 4) + (valor2 * valor2 / 4));
    }

    public String toString() {
        return "Area: "+calculaArea()+" Perimetro: "+calculaPerimetro();
    }
}
