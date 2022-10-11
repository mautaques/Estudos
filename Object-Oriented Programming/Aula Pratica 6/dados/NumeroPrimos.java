public class NumeroPrimos extends gerador{
    
    public void gerar(int n) {
		int quantidade = 0;
		int numero = 2;
		do {
			if(primo(numero)) {
				adicionarSequencia(numero);
				quantidade++;
			}
			numero++;
		} while(quantidade < n);
	}
	
	public boolean primo(int x ) {
		for (int i = 2; i < x; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
