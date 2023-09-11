public class Conta {
    
    private String nome;
    private float valor;
    private float desconto;

    public Conta(){
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getDesconto() {
        return this.desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public String toString(){
        return "Nome: " + getNome() + "Valor: " + getValor() + "Desconto: "
        + getDesconto();

    }
}
