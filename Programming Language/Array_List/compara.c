#include <stdio.h>

int compara(float a[], float b[], int n){

    int cont = 0, i;

    for( i = 0; i < n; i++){
        if(a[i] == b[i])
            cont++;
    }

    if(cont == n){
        return 1;
    }else{
        return 0;
    }

}    

int main(void){

    int i, n;

    scanf("%i",&n);

    float a[n], b[n];

    printf("\n");

    for(i = 0; i < n; i++){
        scanf("%f",&a[i]);
    }

    printf("\n");

    for(i = 0; i < n; i++){
        scanf("%f",&b[i]);
    }

    printf("%i",compara(a,b,n));

    return 0;
}