package apresentacao;

import negocio.SisAplicativo;

public class Main {

    public static void main(String[] args) {

        SisAplicativo s = new SisAplicativo();

        new MenuBoasVindas(s);
    }

}
