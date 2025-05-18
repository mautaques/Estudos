#include <stdio.h>
#include <math.h>

double func(double x) {
    return x + (atan(atan(abs(0.1 * x - 0.7)))); // Ex: f(x) = x + tan(tan(abs(1/10x - 7/10)))
}

double metod_trape(double a, double b, int n) {
    double h = (b - a) / n; // Tamanho de cada intervalo
    double sum = 0.0;

    // Soma dos extremos
    sum += func(a) / 2.0;
    sum += func(b) / 2.0;

    // Soma dos termos do meio
    for (int i = 1; i < n; i++) {
        double x = a + i * h;
        sum += func(x);
    }

    // Multiplica a soma pelo tamanho dos intervalos
    return sum * h;
}

int main() {
    double a, b; 
    int n;       

    printf("Digite o limite inferior: ");
    scanf("%lf", &a);
    printf("Digite o limite superior: ");
    scanf("%lf", &b);
    printf("Digite o número de subintervalos: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("O número de subintervalos deve ser maior que zero.\n");
        return -1;
    }

    double res = metod_trape(a, b, n);

    printf("O valor aproximado resultante é: %.6lf\n", res);

    return 0;
}
