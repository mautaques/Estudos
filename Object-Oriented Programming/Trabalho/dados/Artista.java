package dados;

import java.util.ArrayList;
import java.util.List;

public class Artista {

    private String nome;

    private List<Musica> musicasArtista = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicasArtista() {
        return musicasArtista;
    }

    public void setMusicasArtista(List<Musica> musicasArtista) {
        this.musicasArtista = musicasArtista;
    }

    public Artista() {
    }

    public String toString() {
        return "Artista{" +
                "nome='" + nome + '\'' +
                ", musicasArtista=" + musicasArtista +
                '}';
    }
}
