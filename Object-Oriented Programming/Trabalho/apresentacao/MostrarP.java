package apresentacao;

import dados.Playlist;
import negocio.SisAplicativo;

import javax.swing.*;

public class MostrarP extends JFrame{
    private JList listPlaylist;
    private JPanel MostrarP;
    private JButton voltarButton;

    public MostrarP(SisAplicativo s) {

        setContentPane(MostrarP);
        setTitle("Mostrar Playlists");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        DefaultListModel<String> modelo = new DefaultListModel<>();

        listPlaylist.setModel(modelo);

        int cont = 0;

        for(Playlist i: s.getUlog().getPlaylists()){
            modelo.add(cont,i.toString());
            cont++;
        }

        voltarButton.addActionListener(e -> {
            new Playlists(s);
            dispose();
        });
    }
}
