package src.pkg;

public class Circulo extends FormaGeometrica{

    public void setRaio(int raio){
        super.valor1 = raio;
    }

    public int calculaArea(){
        return (int) Math.PI * valor1 * valor1;
    }

    public int calculaPerimetro(){
        return (int) Math.PI * valor1 * 2;
    }

    public String toString() {
        return "Area: "+calculaArea()+" Perimetro: "+calculaPerimetro();
    }
}
