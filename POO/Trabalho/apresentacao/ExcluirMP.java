package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class ExcluirMP extends JFrame{
    private JTextField nomePField;
    private JTextField nomeMField;
    private JButton excluirButton;
    private JPanel ExcluirMP;
    private JButton voltarButton;

    public ExcluirMP(SisAplicativo s) {

        setContentPane(ExcluirMP);
        setTitle("Excluir Música");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        excluirButton.addActionListener(e -> {

            String nomeP = nomePField.getText();

            String nomeM = nomeMField.getText();

            if (nomeP.isEmpty() || nomeM.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome da playlist ou da música está vazio",
                        "Excluir Música", JOptionPane.ERROR_MESSAGE);
            } else {

                if (s.excluirMusicaPlaylist(nomeP,nomeM)) {
                    JOptionPane.showMessageDialog(null, "Música excluída",
                            "Excluir Música", JOptionPane.INFORMATION_MESSAGE);
                    new Playlists(s);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Música não encontrada",
                            "Excluir Música", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        voltarButton.addActionListener(e -> {
            new Playlists(s);
            dispose();
        });
    }
}
