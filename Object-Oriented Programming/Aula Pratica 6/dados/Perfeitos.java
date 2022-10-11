public class Perfeitos extends gerador{
    
    public void gerar(int n) {

        for (int i = 1; i < n; i++) {
            if (perfeitos(i)) {
                adicionarSequencia(i);
            }
        }

    }

    public boolean perfeitos(int n) {

        int somatorio = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                somatorio += i;
            }
        }

        if (n != somatorio) {
            return false;
        } else {
            return true;
        }
    }

}
