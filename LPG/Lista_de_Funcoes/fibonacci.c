#include <stdio.h>

int fibo( int x){

    int i, soma, aux1=1, aux2=0, v[x];

    for(i=0;i<=x;i++){

        soma = aux1 + aux2;
        aux1 = aux2;
        aux2 = soma;
        v[i] = soma;

        printf("\n%i",v[i]);
    }

}

int main(void){

    int n;

    scanf("%i",&n);

    fibo(n);

    return 0;
}
