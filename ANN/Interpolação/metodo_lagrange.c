#include <stdio.h>

double interpolacao(double x[], double y[], int n, double ponto) {
    double valor_ponto = 0.0;

    
    for (int i = 0; i < n; i++) {
        double termo = y[i];

        for (int j = 0; j < n; j++) {
            if (j != i) {
                termo *= (ponto - x[j]) / (x[i] - x[j]);
            }
        }
        valor_ponto += termo;
    }
    return valor_ponto;
}

int main() {

    int n = 6;

    double x[] = {-5, -3, -2, 3, 4, 6}, 
    y[] = {4002, 324, 39, -6, -327, -4545}, 
    ponto = 0;

    double valor_ponto = interpolacao(x, y, n, ponto);

    printf("Resultado: %.6lf\n", valor_ponto);

    return 0;
}
