package dados;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nome;

    private List<Musica> playlist = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<Musica> playlist) {
        this.playlist = playlist;
    }

    public Playlist(String nome) {
        this.nome = nome;
    }

    public Playlist() {
    }

    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", playlist=" + playlist +
                '}';
    }

}
