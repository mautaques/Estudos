package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class Opcoes extends JFrame{
    private JPanel Opcoes;
    private JButton excluirUsuárioButton;
    private JButton logoutButton;
    private JButton voltarButton;

    public Opcoes(SisAplicativo s) {

        setContentPane(Opcoes);
        setTitle("Opcoes");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        excluirUsuárioButton.addActionListener(e -> {
            new ExcluirU(s);
            dispose();
        });

        logoutButton.addActionListener(e -> {
            s.logoutUsuario();
            new MenuBoasVindas(s);
            dispose();
        });

        voltarButton.addActionListener(e -> {
            new MenuAplicativo(s);
            dispose();
        });
    }
}
