package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class ExcluirM extends JFrame{
    private JTextField nomeField;
    private JButton voltarButton;
    private JButton excluirButton;
    private JPanel ExcluirM;

    public ExcluirM(SisAplicativo s) {

        setContentPane(ExcluirM);
        setTitle("Excluir Música");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        excluirButton.addActionListener(e -> {

            String nome = nomeField.getText();

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome está vazios",
                        "Excluir Música", JOptionPane.ERROR_MESSAGE);
            } else {

                if (s.excluirMusica(nome)) {
                    JOptionPane.showMessageDialog(null, "Música excluída",
                            "Excluir Música", JOptionPane.INFORMATION_MESSAGE);
                    new Musicas(s);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Música não encontrada",
                            "Excluir Música", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        voltarButton.addActionListener(e -> {
            new Musicas(s);
            dispose();
        });
    }
}
