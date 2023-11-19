#include <stdio.h>

int troca_valor(float *a,float *b){
    float temp;

    temp = *a;
    *a = *b;
    *b = temp;
}

int main(void){

    float a, b;

    scanf("%f %f",&a, &b);

    printf("\n");

    printf("%.1f %.1f\n",a,b);

    printf("\n");

    troca_valor(&a,&b);

    printf("%.1f %.1f\n",a,b);

    return 0;
}