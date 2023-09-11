package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class MenuBoasVindas extends JFrame{
    private JButton loginButton;
    private JButton cadastrarButton;
    private JPanel MenuBoasVindasPanel;
    private JButton sairButton;

    public MenuBoasVindas(SisAplicativo s) {

        setContentPane(MenuBoasVindasPanel);
        setTitle("MenuBoasVindas");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        loginButton.addActionListener(e -> {
            new Login(s);
            dispose();
        });

        cadastrarButton.addActionListener(e -> {
            new Cadastro(s);
            dispose();
        });

        sairButton.addActionListener(e -> dispose());
    }


}
