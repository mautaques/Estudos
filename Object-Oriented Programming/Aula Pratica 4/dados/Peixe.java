public class Peixe extends Animal{
    
    private float temperaturaIdeal;

    public float getTemperaturaIdeal() {
        return this.temperaturaIdeal;
    }

    public void setTemperaturaIdeal(float temperaturaIdeal) {
        this.temperaturaIdeal = temperaturaIdeal;
    }

    public calculaespacoOcupado(){
        return largura * comprimento * altura;
    }

    public String toString() {
		return super.toString() + " Temperatura: " + temperaturaIdeal;
	}
}
