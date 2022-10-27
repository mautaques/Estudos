package src.pkg;

public class TrianguloEquilatero extends FormaGeometrica{

    public void setLado(int lado){
        super.valor1 = lado;
    }
    public int calculaArea(){
        return (int) (valor1 * valor1 * Math.sqrt(3) / 4);
    }

    public int calculaPerimetro(){
        return valor1 * 3;
    }

    public String toString() {
        return "Area: "+calculaArea()+" Perimetro: "+calculaPerimetro();
    }
}
