package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class Login extends JFrame{
    private JTextField usernameField;
    private JPasswordField senhaField;
    private JButton loginButton;
    private JPanel Login;
    private JButton voltarButton;

    public Login(SisAplicativo s) {

        setContentPane(Login);
        setTitle("Login");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        loginButton.addActionListener(e -> {

            String username = usernameField.getText();

            String senha = String.valueOf(senhaField.getPassword());

            if(s.loginUsuario(username,senha)){
                JOptionPane.showMessageDialog(null, "Usuário logado",
                        "Logar Usuário", JOptionPane.INFORMATION_MESSAGE);
                new MenuAplicativo(s);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Nome de usuário ou senha incorretos",
                        "Logar Usuário", JOptionPane.ERROR_MESSAGE);
                new MenuBoasVindas(s);
                dispose();
                }
        });

        voltarButton.addActionListener(e -> {
            new MenuBoasVindas(s);
            dispose();
        });
    }
}
