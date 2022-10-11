import dados.Conta;

public abstract class Cliente {
    
    private String cpf;
    private String nome;
    private String endereco;

    public Cliente(){
    }

    List<Conta> contas = new ArrayList<Conta> ();

    for(int i = 0; i < 3; i++){
        Sistem.out.println(contas);
    }

    public String getCpf() {
        return this.cpf;private String nome;
        private float valor;
        private float desconto;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public getMensalidade(){
        for(int i = 0; i < 3; i++){
            getValor(i)++;
        }
        return getValor() - getDescontos;
    }

    public getDescontos(){
        for(int i = 0; i < 3; i++){
            return getDesconto(i)++;  
        }
    }

    Public String toString(){
        return "Cpf: " + getCpf() + "Nome: " + getNome(); +
        "Endereço: " + getEndereco();
    } 
}
