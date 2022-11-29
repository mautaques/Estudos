package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Artistas extends JFrame{
    private JPanel Artistas;
    private JButton mostrarArtistasButton;
    private JButton voltarButton;

    public Artistas(SisAplicativo s) {

        setContentPane(Artistas);
        setTitle("Artistas");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        mostrarArtistasButton.addActionListener(e -> {
            new MostrarA(s);
            dispose();
        });

        voltarButton.addActionListener(e -> {
            new MenuAplicativo(s);
            dispose();
        });
    }
}
