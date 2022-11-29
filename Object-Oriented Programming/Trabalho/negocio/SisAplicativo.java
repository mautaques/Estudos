package negocio;

import dados.Artista;
import dados.Musica;
import dados.Playlist;
import dados.Usuario;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class SisAplicativo {

    private List<Usuario> usuarios = new ArrayList<>();

    private Usuario ulog;

    public Usuario getUlog() {
        return ulog;
    }

    public boolean cadastrarUsuario(String username, String senha) {
        boolean retorno = true;
        Usuario u = new Usuario();

        for (Usuario i : usuarios){
            if (i.getUsername().equals(username)) {
                retorno = false;
                break;
            }
        }
        u.setUsername(username);
        u.setSenha(senha);

        usuarios.add(u);
        return retorno;
    }

    public boolean excluirUsuario(Usuario usuario){
        if(usuarios.size() == 0){
            return false;
        }
        usuarios.remove(usuario);
        return true;
    }

    public boolean loginUsuario(String username, String senha){
        boolean retorno = false;

        for(Usuario i: usuarios){
            if(i.getUsername().equals(username)){
                if(i.getSenha().equals(senha)){
                    this.ulog = i;
                    retorno = true;
                    break;
                }
            }
        }

        return retorno;
    }

    public void logoutUsuario(){
        this.ulog = null;
    }

    public boolean criarPlaylist(String nome){
        boolean retorno = true;
        boolean temp = false;

        Playlist p = new Playlist();

            for(Playlist i: ulog.getPlaylists()) {
                if (i.getNome().equals(nome)) {
                    retorno = false;
                }else
                    temp = true;
            }

            if(temp = true){
                p.setNome(nome);
                ulog.getPlaylists().add(p);
            }

        return retorno;
    }

    public boolean adicionarMusicaPlaylist(String nomeP, String nomeM){

        boolean retorno = true;

        for(Playlist i: ulog.getPlaylists()){
            if(i.getNome().equals(nomeP)){
                for(Musica j: ulog.getMusicas()){
                    if(j.getNome().equals(nomeM)){
                        i.getPlaylist().add(j);
                        break;
                    }else
                        retorno = false;
                }
            }else
                retorno = false;
        }
        return retorno;
    }

    public boolean excluirMusicaPlaylist(String nomeP, String nomeM){
        boolean retorno = true;

        for(Playlist i: ulog.getPlaylists()){
            if(i.getNome().equals(nomeP)){
                for(Musica j: ulog.getMusicas()){
                    if(j.getNome().equals(nomeM)){
                        i.getPlaylist().remove(j);
                        break;
                    }else
                        retorno = false;
                }
            }else
                retorno = false;
        }
        return retorno;
    }

    public boolean adicionarMusica(String nome, String nomeArtista, String arquivo) {
        boolean retorno = true;

        Musica m = new Musica();
        Artista a = new Artista();

        for (Musica i : ulog.getMusicas()) {
            if (i.getNome().equals(nome)) {
                retorno = false;
                break;
            }
        }

        if (retorno) {

            m.setNome(nome);
            m.setArquivo(arquivo);
            a.setNome(nomeArtista);
            m.getArtistas().add(a);
            ulog.getMusicas().add(m);

            for(Artista i: ulog.getArtistas()){
                if(i.getNome().equals(nomeArtista)) {
                    i.getMusicasArtista().add(m);
                    break;
                }
            }
            ulog.getArtistas().add(a);
            a.getMusicasArtista().add(m);
        }

        return retorno;
    }

    public boolean excluirMusica (String nome){
        boolean retorno = true;

        for (Musica i : ulog.getMusicas()) {
            if (i.getNome().equals(nome)) {
                ulog.getMusicas().remove(i);
                break;
            } else {
                retorno = false;
                break;
            }
        }

        return retorno;
    }

    public boolean reproduzirMusica (String nome){
        boolean retorno = true;

        for (Musica i : ulog.getMusicas()) {
            if (i.getNome().equals(nome)) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(i.getArquivo());
                    Player mp3 = new Player(fileInputStream);
                    mp3.play(300);
                } catch (JavaLayerException | FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                break;
            } else
                retorno = false;
            break;
        }
        return retorno;
    }

    public boolean adicionarArtista(String nomeM, String nomeA){
        boolean retorno = false;

        Artista a = new Artista();

        for(Musica i: ulog.getMusicas()){
            if(i.getNome().equals(nomeM)){
                if(i.getArtistas().contains(nomeA)){
                    break;
                }else{
                    for(Artista j: ulog.getArtistas()){
                        if(j.getNome().equals(nomeA)){
                            i.getArtistas().add(j);
                            retorno = true;
                            break;
                        }else{
                            a.setNome(nomeA);
                            a.getMusicasArtista().add(i);
                            i.getArtistas().add(a);
                            ulog.getArtistas().add(a);
                            retorno = true;
                            break;
                        }
                    }
                    break;
                }
            }
        }

        return retorno;
    }

}
