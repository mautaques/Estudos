public class Fatoriais extends gerador{

    public void gerar(int x) {
		int contador = 1;
		
		for(int i=2; i <= x; i++) {
			contador = 1;
			
			for (int j =2 ; j <= i; j++) {
				
				contador *= j;
			}
			
			adicionarSequencia(contador);
			
		}
	}
    
}
