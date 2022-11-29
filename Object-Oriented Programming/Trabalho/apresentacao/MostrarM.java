package apresentacao;

import dados.Musica;
import negocio.SisAplicativo;

import javax.swing.*;

public class MostrarM extends JFrame{
    private JList listMusicas;
    private JPanel MostrarM;
    private JButton voltarButton;

    public MostrarM(SisAplicativo s) {

        setContentPane(MostrarM);
        setTitle("Mostrar Músicas");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        DefaultListModel<String> modelo = new DefaultListModel<>();

        listMusicas.setModel(modelo);

        System.out.println(s.getUlog().getMusicas());

        int cont = 0;

        for(Musica i: s.getUlog().getMusicas()){
            modelo.add(cont,i.toString());
            cont++;
        }

        voltarButton.addActionListener(e -> {
            new Musicas(s);
            dispose();
        });
    }
}
