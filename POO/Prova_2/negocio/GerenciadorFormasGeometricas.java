package negocio;

import dados.FormaGeometrica;
import dados.Quadrilatero;
import dados.Circulo;
import dados.TrianguloEquilatero;
import dados.Quadrado;
import dados.Retangulo;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;
import java.util.Objects;

public class GerenciadorFormasGeometricas {

    Quadrado q;

    Retangulo r;

    Circulo c;

    TrianguloEquilatero t;

    List<Objects> formas = new ArrayList<>();

    public void adicionarQuadrado(float x, float y, float lado){
        Quadrado q = new Quadrado(x,y,lado, lado, lado, lado);

        q.calculaArea();
        q.calculaPerimetro();
    }

    public void adicionarRetangulo(float x, float y, float base, float altura){
        Retangulo r = new Retangulo(x,y,base,altura);

        r.calculaArea();
        r.calculaPerimetro();
    }

    public void adicionarCiculo(float x, float y, float raio){
        Circulo c = new Circulo(x,y,raio);

        c.calculaArea();
        c.calculaPerimetro();
    }

    public void adicionarTrianguloEquilatero(float x, float y, float lado){
        TrianguloEquilatero t = new TrianguloEquilatero(x,y,lado);

        t.calculaArea();
        t.calculaPerimetro();
    }

    public void adicionarFormas(float x, float y, float lado, float base, float altura, float raio){

        formas.add(q);
        formas.add(r);
        formas.add(c);
        formas.add(t);
    }
}
