#include <stdio.h>
#include <math.h>

double funcao(double x){
    return x*x-4;
}

double falsa_posicao(double a, double b, int n){
    double tol1 = 0.001, tol2 = 0.001;

    double fa = funcao(a);
    double fb = funcao(b);

    if (fa * fb > 0){
        printf("ERRO: O intervalo não contém uma raiz.\n");
        return NAN; 
    }

    for(int i = 0; i < n; i++){
        double p = (a * fb - b * fa)/(fb - fa);
        double fp = funcao(p);

        if((b - a) < tol1 || fabs(fp) < tol2){
            return printf("%lf\n",p);
        }else{
            if((fa * fp) > 0){
                a = p;
                fa = funcao(a);
            }else{
                b = p;
                fb = funcao(b);
            }
        }
    } 
    printf("ERRO: Iterações Insuficientes\n");
    return NAN;
}

int main(){

    printf("Digite um intervalo de A a B:\n");
    double a;
    scanf("%lf",&a);
    double b;
    scanf("%lf",&b);

    printf("Digite a quantiade de iterações:\n");
    int n;
    scanf("%d",&n);

    falsa_posicao(a ,b, n);

    return 0;
}
