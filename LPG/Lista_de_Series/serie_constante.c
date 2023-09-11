#include<stdio.h>

int main(void){

    int n, num=1, den=0, i, aux=0;
    float res, soma;

    scanf("%i",&n);

    for(i=0;i<n;i++){

        den = aux;

        if(aux == 0 || aux == 1){

            den = 1;
        }else{
           
            for(i=0;i<aux;i++){
                den = den * (den - 1);
            }
        }

        res = (float)num/(float)den;

        printf("\n\n");
        printf("%i/%i = %.2f",num,den,res);

        aux++;
        
        soma += res;
    }

    printf("\n\n");
    printf("Somatório: %f",soma);

    return 0;
}
