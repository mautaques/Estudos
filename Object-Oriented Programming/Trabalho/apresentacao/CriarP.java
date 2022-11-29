package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class CriarP extends JFrame{
    private JPanel CriarP;
    private JTextField nomeField;
    private JButton criarButton;
    private JButton voltarButton;

    public CriarP(SisAplicativo s) {

        setContentPane(CriarP);
        setTitle("Criar Playlist");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        criarButton.addActionListener(e -> {

            String nome = nomeField.getText();

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome da playlist está vazio",
                        "Criar Playlist", JOptionPane.ERROR_MESSAGE);
            } else {

                if (s.criarPlaylist(nome)) {
                    JOptionPane.showMessageDialog(null, "Playlist Criada",
                            "Criar Playlist", JOptionPane.INFORMATION_MESSAGE);
                    new Playlists(s);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Nome de playlist já existe",
                            "Criar Playlist", JOptionPane.ERROR_MESSAGE);
                }
            }

        });

        voltarButton.addActionListener(e -> {
            new Playlists(s);
            dispose();
        });
    }
}
