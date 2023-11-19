public class Aquario extends Viveiro{
    
    private float altura;
    private float temperatura;

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public calculaEspaco(){
        return comprimento * largura * altura;
    }

    public boolean adicionaAnimal(Animal animal) {
		if (espacoDisponivel() >= (animal.calculaEspacoOcupado() * 0.7)) {
			if (animal instanceof Peixe) {
				Peixe p = (Peixe) animal;

				if ((p.getTemperaturaIdeal() < temperatura - 3) || (p.getTemperaturaIdeal() > temperatura + 3)) {
					return false;
				}
			} else {
				return false;
			}
			animais[quantidadeAnimais] = animal;
			quantidadeAnimais++;
			return true;
		} else {
			return false;
		}
	}
}
