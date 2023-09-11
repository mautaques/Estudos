#include <stdio.h>
#include <stdbool.h>

int verificaprimos(int x){
    
    int j, contador=0;

    for(j=1;j<=x;j++){
        if(x % j == 0)
        contador++;
    }

    return contador;
}

int main(void){
    
    int k, n, i, contador1=0;

    scanf("%i%i",&k,&n);

    i = k;

    while(contador1 < n){

    if(verificaprimos(i) == 2){
        printf("\n%i",i);
        contador1++;
    }

    i++;

    }

    return 0;
}
