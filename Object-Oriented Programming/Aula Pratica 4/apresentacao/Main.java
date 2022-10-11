import java.util.Scanner;

import dados.Animal;
import dados.Aquario;
import dados.Peixe;
import dados.Viveiro;
import negocio.Zoologico;

public class Main {

    private static Zoologico zoo = new Zoologico();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args){

        int opcao = -1;

        while(opcao != 0){

            mostraMenu();
            opcao = Integer.parseInt(s.nextLine());

            switch (opcao){
                case 0;
                    break;
                case 1;
                    CadastrarViveiro();
                    break;
                case 2;
                    CadastrarAnimal();
                case 3;
                    MostrarTodosViveiros();
                case 4;
                    MostrarTodosAnimais();
                    break;
            }
        }

    }

    
}

