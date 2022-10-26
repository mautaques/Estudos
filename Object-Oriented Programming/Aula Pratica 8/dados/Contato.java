import java.util.Objects;

public class Contato {

    private String nome;
    private int telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return telefone == contato.telefone && nome.equals(contato.nome);
    }

    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
