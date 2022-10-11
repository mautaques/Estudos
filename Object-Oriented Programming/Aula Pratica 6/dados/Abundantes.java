public class Abundantes extends gerador{

    public void gerar(int n) {
		int quantidade = 0;
		int numero = 2;
		do {
			if(abundante(numero)) {
				adicionarSequencia(numero);
				quantidade++;
			}
			numero++;
		} while(quantidade < n);
	}
	
	public boolean abundante(int x) {
		int somatorio = 0;
		
		for(int i=1; i < x; i++) {
			if(x % i == 0) {
				somatorio += i;
			}
		}
		
		if (x > somatorio) {
			return false;
		}
		else {
			return true;
		}
			
	}
}
