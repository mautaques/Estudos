public class quadrados extends gerador{
    
    public void gerar(int x) {

        for (int i = 0; i < x; i++) {
            adicionarSequencia(i * i);
        }
    }
}
