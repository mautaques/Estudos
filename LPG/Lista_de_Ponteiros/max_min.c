#include <stdio.h>

void max_min(int vet[], int tam, int *pMin, int *pMax){

    int i, j;

    *pMin = vet[0];
    *pMax = vet[0];    

    for(i = 0; i < tam; i++){
        if((*pMin) > vet[i])
            *pMin = vet[i];
        if((*pMax) < vet[i])
            *pMax = vet[i];
    }

}

int main(void){

    int n, pMin, pMax;

    scanf("%i",&n);

    printf("\n");

    int v[n];

    for(int i = 0; i < n; i++){
        scanf("%i",&v[i]);
    }

    printf("\n");

    max_min(v,n,&pMin,&pMax);

    printf("%i %i",pMin,pMax);

    return 0;
}