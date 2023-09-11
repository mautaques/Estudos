package apresentacao;

import javax.swing.*;

import dados.Usuario;
import negocio.SisAplicativo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExcluirU extends JFrame{
    private JTextField usernameField;
    private JPasswordField senhaField;
    private JButton excluirButton;
    private JPanel ExcluirU;
    private JButton voltarButton;

    public ExcluirU(SisAplicativo s) {

        setContentPane(ExcluirU);
        setTitle("Excluir Usuário");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        excluirButton.addActionListener(e -> {

            String username = usernameField.getText();

            String senha = new String(senhaField.getPassword());

            Usuario u = new Usuario(username,senha);

            if(s.excluirUsuario(u)){
                JOptionPane.showMessageDialog(null, "Usuário removido",
                        "Cadastrar usuário", JOptionPane.INFORMATION_MESSAGE);
                        new MenuAplicativo(s);
                        dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível excluir usuário",
                        "Cadastrar usuário", JOptionPane.ERROR_MESSAGE);
                        new MenuAplicativo(s);
                        dispose();
            }
        });

        voltarButton.addActionListener(e -> {
            new MenuAplicativo(s);
            dispose();
        });
    }
}
