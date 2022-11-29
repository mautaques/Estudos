package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class Cadastro extends JFrame{
    private JButton cadastrarButton;
    private JTextField usernameField;
    private JPasswordField senhaField;
    private JPanel Cadastro;
    private JButton voltarButton;

    public Cadastro(SisAplicativo s) {

        setContentPane(Cadastro);
        setTitle("Cadastro");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        cadastrarButton.addActionListener(e -> {

            String username = usernameField.getText();

            String senha = String.valueOf(senhaField.getPassword());

            if (username.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Username e/ou senha estão vazios",
                        "Cadastrar usuário", JOptionPane.ERROR_MESSAGE);
            } else {

                if (s.cadastrarUsuario(username,senha)) {
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado",
                            "Cadastrar usuário", JOptionPane.INFORMATION_MESSAGE);
                    new MenuBoasVindas(s);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Nome de usuário já existe",
                            "Cadastrar usuário", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        voltarButton.addActionListener(e -> {
            new MenuBoasVindas(s);
            dispose();
        });
    }
}
