package Exercicio1;

public class Cliente {
    
    private String nome;
    private String cpf;
    private String telefone;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String toString(){
        return "Nome: "+ nome +"CPF: "+ cpf +"Telefone: "+ telefone;
    } 

    public boolean equals (Object objeto){
        Cliente cliente;
        if( ! (objeto instanceof Cliente)){
            return false;
        }
        cliente = (Cliente) objeto;
        if(nome.equals(cliente.getNome())){
            return true;
        }
        return false;
    }

    public Cliente(){
    }
}
