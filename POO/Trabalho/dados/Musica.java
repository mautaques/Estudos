package dados;

import java.util.ArrayList;
import java.util.List;

public class Musica {
1 minute ago
    private String nome;

    private List<Artista> artistas = new ArrayList<>();

    private String arquivo;

    public String getNome() {
        return nome;
    }1 minute ago

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public Musica() {
    }

    public String toString() {
        return "Musica{" +
                "nome='" + nome +
                "arquivo='" + arquivo +
                '}';
    }
}
