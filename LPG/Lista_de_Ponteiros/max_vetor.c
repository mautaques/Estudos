#include <stdio.h>

void max_vetor(float vet[], int tam, float *pMax, int *pIndice){

    *pMax = vet[0];
    *pIndice = 0;

    for(int i = 0; i < tam; i++){
        if(*pMax < vet[i]){
            *pMax = vet[i];
            *pIndice = i; 
        }    
    }
}

int main(void){

    int n;

    scanf("%i",&n);

    printf("\n");

    int v[n], max, indice;

    for(int i = 0; i < n; i++){
        scanf("%i",&v[i]);
    }

    printf("\n");

    max_vetor(v,n,&max,&indice);

    printf("número:%i índice:%i",max,indice);

    return 0;
}