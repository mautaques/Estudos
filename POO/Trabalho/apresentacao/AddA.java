package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class AddA extends JFrame{
    private JTextField nomeMusicaField;
    private JButton voltarButton;
    private JTextField nomeArtistaField;
    private JButton adicionarButton;
    private JPanel AddA;

    public AddA(SisAplicativo s) {

        setContentPane(AddA);
        setTitle("Adicionar Artista");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        adicionarButton.addActionListener(e -> {

            String nomeM = nomeMusicaField.getText();

            String nomeA = nomeArtistaField.getText();

            if (nomeM.isEmpty() || nomeA.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome da música e/ou nome do artista estão vazios",
                        "Adicionar Artista", JOptionPane.ERROR_MESSAGE);
            } else {

                if (s.adicionarArtista(nomeM,nomeA)) {
                    JOptionPane.showMessageDialog(null, "Artista adicionado",
                            "Adicionar Artista", JOptionPane.INFORMATION_MESSAGE);
                    new Musicas(s);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Artista já existe nessa música",
                            "Adicionar Artista", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        voltarButton.addActionListener(e -> {
            new Musicas(s);
            dispose();
        });
    }
}
