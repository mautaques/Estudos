package Exercicio2;

public class Veterinario {
    
    private String nome;
    private float salario;
    private Endereço endereco;
    private Animal[] animais;
    private int quantidadeAnimais = 0;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public Endereço getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }
    public void setAnimal(Animal p){

        if(this.quantidadeAnimais < 5){
            animais[this.quantidadeAnimais] = p;
            this.quantidadeAnimais++;
        }
    }
    public Veterinario(int quantAnimais){
        animais = new Animal[quantidadeAnimais]; 
    }

    public String toString() {
		return "Nome: "+nome+" Salário: "+salario;
	}

    public void cadastrarAnimal(Animal animal) {
		if (quantidadeAnimais < animais.length) {
			animais[quantidadeAnimais] = animal;
			quantidadeAnimais++;
		}
	}
}
