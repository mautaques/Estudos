public class Viveiro {
    
    protected String nome;
    protected float comprimento;
    protected float largura; 

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return this.largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public calculaEspaco(){
        return largura * comprimento;
    }

    private espacoOcupado(){
        float area = 0;
		for (int i = 0; i < quantAnimais; i++) {
			area += animais[i].calculaEspacoOcupado();
		}
		return area;
        
    }

    public espacoDisponivel(){
        return calculaEspaco() - espacoOcupada();
    }

    public boolean adicionarAnimal(Animal animal){
        if (espacoDisponivel() >= (animal.calculaEspacoOcupado() * 0.7)) {
			animais[quantidadeAnimais] = animal;
			quantidadeAnimais++;
			return true;
		} else {
			return false;
		}
    }

    public String toString() {
		StringBuffer string = new StringBuffer();
		if (this instanceof Aquario) {
			System.out.print("Aquario \n");
		} else {
			System.out.print("Viveiro \n");
		}
		System.out.print("Nome: " + nome + "\n");
		for (int i = 0; i < quantidadeAnimais; i++) {
			System.out.print("\t" + animais[i].toString() + "\n");
		}
		return string.toString();
	}

}