package dados;

import java.util.Arrays;

public class Veterinario {

    private String nome;
    private float salario;
    private Endereco endereco;
    private Animal[] animais = new Animal[3];
    private int qntAnimais = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal a) {
        if(this.qntAnimais < 3){
            animais[this.qntAnimais] = a;
            this.qntAnimais++;
        }
    }

    public int getQntAnimais() {
        return qntAnimais;
    }

    public void setQntAnimais(int qntAnimais) {
        this.qntAnimais = qntAnimais;
    }

    public String toString() {
        return "Veterinario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", endereco=" + endereco +
                ", animais=" + Arrays.toString(animais) +
                ", qntAnimais=" + qntAnimais +
                '}';
    }
}
