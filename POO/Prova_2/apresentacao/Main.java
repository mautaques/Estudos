package apresentacao;

import negocio.GerenciadorFormasGeometricas;
import java.util.Scanner;
public class Main {

    private static Scanner s = new Scanner(System.in);

    public static void imprimeMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Sair");
        System.out.println("1 - Adicionar Circulo");
        System.out.println("2 - Adicionar Quadrado");
        System.out.println("3 - Adicionar Retangulo");
        System.out.println("4 - Adicionar Triangulo Equilatero");
        System.out.println("5 - Adicionar Formas á Lista");
    }

    public static void main(String[] args) {

        GerenciadorFormasGeometricas g = new GerenciadorFormasGeometricas();

        int opcao = -1;

        while (opcao != 0) {

            imprimeMenu();

            opcao = s.nextInt();

            switch (opcao) {

                case 0:
                    break;
                case 1:
                    System.out.println("Digite as coordenadas x e y: ");

                    float x = s.nextFloat();
                    float y = s.nextFloat();

                    System.out.println("Digite o raio do círculo: ");

                    float raio = s.nextFloat();

                    g.adicionarCiculo(x,y,raio);

                    break;
                case 2:
                    System.out.println("");
                    g.adicionarQuadrado();
                    break;
                case 3:
                    g.adicionarRetangulo();
                    break;
                case 4:
                    g.adicionarTrianguloEquilatero();
                    break;
                case 5:
                    g.adicionarFormas();
                    break;
                default:
                    System.out.println("valor incorreto");
                    break;
            }
        }
    }
}