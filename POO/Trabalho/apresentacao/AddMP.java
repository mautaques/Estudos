package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class AddMP extends JFrame{

    private JPanel AddMP;
    private JTextField nomePField;
    private JTextField nomeMField;
    private JButton adicionarButton;
    private JButton voltarButton;

    public AddMP(SisAplicativo s) {

        setContentPane(AddMP);
        setTitle("Adicionar Música");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        adicionarButton.addActionListener(e -> {

            String nomeP = nomePField.getText();

            String nomeM = nomeMField.getText();

            if (nomeP.isEmpty() || nomeM.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome da playlist ou da música está vazio",
                        "Adicionar Música", JOptionPane.ERROR_MESSAGE);
            } else {

                if (s.adicionarMusicaPlaylist(nomeP, nomeM)) {
                    JOptionPane.showMessageDialog(null, "Música adicionada",
                            "Adicionar Música", JOptionPane.INFORMATION_MESSAGE);
                    new Playlists(s);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Playlist ou música não encontrada",
                            "Adicionar Música", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        voltarButton.addActionListener(e -> {
            new Playlists(s);
            dispose();
        });
    }
}
