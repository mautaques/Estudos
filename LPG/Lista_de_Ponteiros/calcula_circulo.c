#include <stdio.h>

void calcula_circulo(float raio, float *pPerimetro, float *pArea){
    *pPerimetro = 2 * 3.14 * raio;
    *pArea = raio * raio;

}

int main(void){

    float r, pPerimetro, pArea; 

    scanf("%f",&r);

    calcula_circulo(r,&pPerimetro,&pArea);

    printf("%.1f %.1f",pPerimetro,pArea);

    return 0;
}