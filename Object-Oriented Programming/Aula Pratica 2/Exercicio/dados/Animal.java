package Exercicio2;

public class Animal {
    
    private String nome;
    private Dono dono;
    private String especie;
    private String descricao;

    public Animal(){
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Dono getDono() {
        return this.dono;
    }
    public void setDono(Dono dono) {
        this.dono = dono;
    }
    public String getEspecie() {
        return this.especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
