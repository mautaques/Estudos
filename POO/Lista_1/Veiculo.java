package Exercicio1;

public class Veiculo {

    private String marca;
    private int placa;
    private String cor;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPlaca() {
        return this.placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Veiculo(String marca, int placa, String cor){
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
    }

    public String toString(){
        return "Marca: "+ marca +"Placa: "+ placa +"Cor: "+ cor;
    } 

    public boolean equals (Object objeto){
        Veiculo veiculo;
        if( ! (objeto instanceof Veiculo)){
            return false;
        }
        veiculo = (Veiculo) objeto;
        if(marca.equals(veiculo.getMarca())){
            return true;
        }
        return false;
    }

    public Veiculo(){
    }

}
