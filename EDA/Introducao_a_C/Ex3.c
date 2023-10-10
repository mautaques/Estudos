#include <stdio.h>
#include <stdlib.h>

int main(){

    int n, cont = 0;

    scanf("%d",&n);

    for(int i = 2; i <= n / 2; i++){
        if(n % i == 0){
            return printf("não\n");
        }
    }    
    printf("sim\n");
}