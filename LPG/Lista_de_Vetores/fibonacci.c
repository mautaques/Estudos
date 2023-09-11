#include <stdio.h>

void fibonacci(int v[],int n){

    int i;

    for(i = 0; i < n ; i++){
        v[i] = v[i] + v[i-1]; 
    }

    for(i = 0; i < n ; i++){
        printf("%i",v[i]);
        printf("\n");
    }
}

int main(void){

    int n, i;

    scanf("%i",&n);

    int v[n];

    fibonacci(v,n);

    return 0;
}
