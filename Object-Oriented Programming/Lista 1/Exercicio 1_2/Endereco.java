package Exercicio1e2;

public class Endereco {

    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Endereco(String rua, int numero, String bairro, String cidade){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String toString(){
        return "Rua: "+ rua +"Número: "+ numero +"Bairro: "+ bairro +"Cidade: "+ cidade;
    } 

    public boolean equals (Object objeto){
        Endereco endereco;
        if( ! (objeto instanceof Endereco)){
            return false;
        }
        endereco = (Endereco) objeto;
        if(getRua().equals(endereco.getRua())){
            return true;
        }
        return false;
    }

    public Endereco(){
    }
}
