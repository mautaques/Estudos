public class Fibonacci extends gerador{
    
    public void gerar(int x) {
		
		adicionarSequencia(0);
		adicionarSequencia(1);
		
		for(int i = 0; i < x-2; i++) {
			int x1 = adicionarSequencia(tamanhoSequencia()-1);
			int x2 = adicionarSequencia(tamanhoSequencia()-2);
			adicionarSequencia(x1+x2);
		}
		
	}
}
