#include <stdio.h>

int somaNumeros(int x, int y){

    int i, soma=0;

    if(x > y){

        for(i=y+1;i<x;i++){
            if(i % 2 != 0)
            soma += i;
        }
    }else{
        if(y > x){
            for(i=x+1;i<y;i++){
                if(i % 2 != 0)
                soma += i;
            }
        }
    }

    return printf("%i",soma);
}

int main(void){

    int a, b;

    scanf("%i%i",&a,&b);

    somaNumeros(a,b);

    return 0;
}