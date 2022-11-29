package dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {

    private String username;

    private String senha;

    private List<Playlist> playlists = new ArrayList<>();

    private List<Artista> artistas = new ArrayList<>();

    private List<Musica> musicas = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public Usuario(String login, String senha) {
        this.username = login;
        this.senha = senha;
    }

    public Usuario() {
    }

    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", senha='" + senha + '\'' +
                ", playlists=" + playlists +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(getUsername(), usuario.getUsername());
    }
}
