package dados;

public class Dono {

    private String nome;
    private int cpf;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "Dono{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", cpf=" + cpf +
                '}';
    }
}
