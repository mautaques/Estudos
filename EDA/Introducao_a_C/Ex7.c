#include <stdio.h>

int main(void){

    int aux = 0, a = 0, res = 1, n;

    printf("Até qual n-ésima etapa o Fibonacci vai?: \n");

    scanf("%d",&n);

    n--;

    while(n--){
        
        a = aux + res;
        aux = res; 
        res = a;
    }    

    printf("%d",a);

    return 0;
}