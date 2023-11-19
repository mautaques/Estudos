package apresentacao;

import dados.Pessoa;
import dados.Grupo;

public class Main {

    public static void main(String[] args) {
        Grupo g = new Grupo();

        Pessoa p1 = new Pessoa();
        p1.setNome("Cabral");
        p1.setIdade(20);
        p1.setAltura(1.67f);
        p1.setMassa(67);

        Pessoa p2 = new Pessoa();
        p2.setNome("Livia");
        p2.setIdade(21);
        p2.setAltura(1.65f);
        p2.setMassa(64);

        Pessoa p3 = new Pessoa();
        p3.setNome("Vini");
        p3.setIdade(20);
        p3.setAltura(1.72f);
        p3.setMassa(75);

        g.setPessoas(p1);
        g.setPessoas(p2);
        g.setPessoas(p3);

        g.ordena();

        for (int i = 0 ; i < 3 ; i++) {
            System.out.println("Nome:" + g.getPessoas()[i].getNome());
            System.out.println("Altura:" + g.getPessoas()[i].getAltura());
            System.out.println("Idade:" + g.getPessoas()[i].getIdade());
            System.out.println("Massa:" + g.getPessoas()[i].getMassa());
            System.out.println("IMC:" + g.getPessoas()[i].calculaImc() + "\n") ;
        }
    }
}