#include <stdio.h>

int tipo_triangulo(float x, float y, float z){

    if(x + y <= z || z + x <= y){
    return printf("Não forma um Triângulo");
    }else{ 
        if (x == y && y == z){
        return printf("Equilátero");
        }else{ 
            if(x != y && y != z){
            return printf("Escaleno");
            }else return printf("Isóceles");
        }
    }    
}

int main(void){

    float a, b, c;

    scanf("%f %f %f",&a,&b,&c);

    tipo_triangulo(a, b, c);

    return 0;
}
