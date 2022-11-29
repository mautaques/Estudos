package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAplicativo extends JFrame{
    private JButton opcoesButton;
    private JButton playlistsButton;
    private JButton artistasButton;
    private JButton musicasButton;
    private JPanel MenuAplicativo;

    public MenuAplicativo(SisAplicativo s) {

        setContentPane(MenuAplicativo);
        setTitle("MenuAplicativo");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        playlistsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Playlists(s);
                dispose();
            }
        });

        artistasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Artistas(s);
                dispose();
            }
        });

        musicasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Musicas(s);
                dispose();
            }
        });

        opcoesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Opcoes(s);
                dispose();
            }
        });
    }
}
