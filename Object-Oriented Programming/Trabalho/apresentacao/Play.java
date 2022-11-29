package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class Play extends JFrame{
    private JPanel Play;
    private JTextField nomeField;
    private JButton okButton;
    private JButton playButton;

    public Play(SisAplicativo s) {

        setContentPane(Play);
        setTitle("Player");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        playButton.addActionListener(e -> {

            String nome = nomeField.getText();

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome da música está vazio",
                        "Play", JOptionPane.ERROR_MESSAGE);
            } else {

                if (s.reproduzirMusica(nome)) {

                } else {
                    JOptionPane.showMessageDialog(null, "Música não encontrada",
                            "Play", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        okButton.addActionListener(e -> dispose());
    }
}
