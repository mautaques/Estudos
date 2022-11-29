package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class Playlists extends JFrame{
    private JPanel Playlists;
    private JButton mostrarPlaylistsButton;
    private JButton criarPlaylistButton;
    private JButton adicionarMúsicaButton;
    private JButton excluirMúsicaButton;
    private JButton voltarButton;
    private JButton reproduzirMúsicaButton;
    private JTextField nomeField;

    public Playlists(SisAplicativo s) {

        setContentPane(Playlists);
        setTitle("Playlists");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        criarPlaylistButton.addActionListener(e -> {
            new CriarP(s);
            dispose();
        });

        mostrarPlaylistsButton.addActionListener(e -> {
            new MostrarP(s);
            dispose();
        });

        adicionarMúsicaButton.addActionListener(e -> {
            new AddMP(s);
            dispose();
        });

        excluirMúsicaButton.addActionListener(e -> {
            new ExcluirMP(s);
            dispose();
        });

        reproduzirMúsicaButton.addActionListener(e -> {
            new Play(s);
        });

        voltarButton.addActionListener(e -> {
            new MenuAplicativo(s);
            dispose();
        });
    }
}
