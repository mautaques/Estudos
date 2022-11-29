package apresentacao;

import negocio.SisAplicativo;

import javax.swing.*;

public class Musicas extends JFrame{
    private JPanel Musicas;
    private JButton mostrarMúsicasButton;
    private JButton adicionarMúsicasButton;
    private JButton excluirMúsicaButton;
    private JButton voltarButton;
    private JButton reproduzirMúsicaButton;
    private JButton adicionarArtistasButton;

    public Musicas(SisAplicativo s) {

        setContentPane(Musicas);
        setTitle("Músicas");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        adicionarMúsicasButton.addActionListener(e -> {
            new AddM(s);
            dispose();
        });

        mostrarMúsicasButton.addActionListener(e -> {
            new MostrarM(s);
            dispose();
        });

        excluirMúsicaButton.addActionListener(e -> {
            new ExcluirM(s);
            dispose();
        });

        adicionarArtistasButton.addActionListener(e -> {
            new AddA(s);
            dispose();
        });

        reproduzirMúsicaButton.addActionListener(e -> {
            new Play(s);
        });

        voltarButton.addActionListener(e -> {
            new MenuAplicativo(s);
            dispose();
        });

    }
}
