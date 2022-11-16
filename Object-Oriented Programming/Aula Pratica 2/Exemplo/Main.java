package Exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Grupo g = new Grupo();

        Pessoa p1 = new Pessoa();
        p1.setNome("Vinicius");
        p1.setAltura(1.75f);
        p1.setIdade(20);
        p1.setMassa(75.0f);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Livia");
        p2.setAltura(1.65f);
        p2.setIdade(21);
        p2.setMassa(62.5f);

        Pessoa p3 = new Pessoa();
        p3.setNome("Cabral");
        p3.setAltura(1.65f);
        p3.setIdade(20);
        p3.setMassa(65.0f);

        g.setPessoa(p1);
        g.setPessoa(p2);
        g.setPessoa(p3);

        g.ordena();

        for(int i = 0; i < 3; i++){
            System.out.println("Nome: "+g.getPessoas()[i].getNome());
            System.out.println("Altura: "+g.getPessoas()[i].getAltura());
            System.out.println("Idade: "+g.getPessoas()[i].getIdade());
            System.out.println("Massa: "+g.getPessoas()[i].getMassa());
            System.out.println("IMC: "+g.getPessoas()[i].calculaImc() + "\n");
        }

    }
}
