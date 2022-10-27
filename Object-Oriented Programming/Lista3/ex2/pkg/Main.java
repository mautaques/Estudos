package src.pkg;

public class Main {

    public static void main(String[] args) {

        TrianguloEquilatero trianguloequilatero = new TrianguloEquilatero();
        trianguloequilatero.setLado(6);
        Losango losango = new Losango();
        losango.setd(3);
        losango.setD(7);
        Circulo circulo = new Circulo();
        circulo.setRaio(9);

        System.out.println("Triangulo Equilatero: "+trianguloequilatero.toString());
        System.out.println("Losango: "+losango.toString());
        System.out.println("Circulo: "+circulo.toString());



    }

}
