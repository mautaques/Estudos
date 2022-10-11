package Exercicio2;

public class Dono {
    
    private String nome;
    private Endereço endereco;
    private int cpf;

    public Dono(){
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereço getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


}
