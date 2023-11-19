import Animal;
import Aquario;
import Peixe;
import Viveiro;

public class Zoologico {
    
    public cadastrarViveiro(Viveiro viveiro){
        viveiros[quantViveiros] = viveiro;
		quantViveiros++;
    }

    public cadastarAnimais(Animal animal){
        animais[quantAnimais] = animal;
		quantAnimais++;
    }

    public Animal[] getAnimais() {
		return animais;
	}

	public Viveiro[] getViveiros() {
		return viveiros;
	}

	public int getQuantViveiros() {
		return quantidadeViveiros;
	}

	public int getQuantAnimais() {
		return quantidadeAnimais;
	}

    public alocarAnimal(Animal animal, Viveiro viveiro){
        if (viveiro instanceof Aquario) {
			if (animal instanceof Peixe) {
				Aquario aquario = (Aquario) viveiro;
				Peixe peixe = (Peixe) animal;

				if (aquario.adicionaAnimal(peixe)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			if (animal instanceof Peixe) {
				return false;
			} else {
				if (viveiro.adicionaAnimal(animal)) {
					return true;
				} else {
					return false;
				}
			}
		}
    }

    public Aquario[] getSoAquarios(){
        int quantidade = 0;

		for (int i = 0; i < quantidadeViveiros; i++) {
			if (viveiros[i] instanceof Aquario) {
				quantidade++;
			}
		}

		Aquario aquariosTemp[] = new Aquario[quantidade];

		int contador = 0;
		for (int i = 0; i < quantidadeViveiros; i++) {
			if (viveiros[i] instanceof Aquario) {
				aquariosTemp[contador] = (Aquario) viveiros[i];
				contador++;
			}
		}
		return aquariosTemp;
    }

    public Viveiro[] getSoViveiros(){
        int quantidade = 0;

		for (int i = 0; i < quantidadeViveiros; i++) {
			if (!(viveiros[i] instanceof Aquario)) {
				quantidade++;
			}
		}

		Viveiro viveirosTemp[] = new Viveiro[quantidade];

		int contador = 0;
		for (int i = 0; i < quantidadeViveiros; i++) {
			if (!(viveiros[i] instanceof Aquario)) {
				viveirosTemp[contador] = viveiros[i];
				contador++;
			}
		}
		return viveirosTemp;
    }
}
