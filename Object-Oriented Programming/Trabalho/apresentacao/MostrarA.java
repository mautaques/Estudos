package apresentacao;

import dados.Artista;
import negocio.SisAplicativo;

import javax.swing.*;

public class MostrarA extends JFrame{
    private JPanel MostrarA;
    private JList listArtistas;
    private JButton voltarButton;

    public MostrarA(SisAplicativo s) {

        setContentPane(MostrarA);
        setTitle("Mostrar Artistas");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        DefaultListModel<String> modelo = new DefaultListModel<>();

        listArtistas.setModel(modelo);

        int cont = 0;

        for(Artista i: s.getUlog().getArtistas()){
            modelo.add(cont,i.toString());
            cont++;
        }

        voltarButton.addActionListener(e -> {
            new Artistas(s);
            dispose();
        });
    }
}
