#include <stdio.h>

void inc_dec(int *a, int *b){
    (*a)++;
    (*b)--;
}

int main(void){

    int a, b;

    scanf("%i %i",&a,&b);

    inc_dec(&a,&b);

    printf("%i %i",a ,b);

    return 0;
}