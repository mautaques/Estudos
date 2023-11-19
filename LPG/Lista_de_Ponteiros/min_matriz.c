#include <stdio.h>

void min_matriz(float mat[3][4], float *pMin, int *pI, int *pJ){

    *pMin = mat[0][0];

    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
            if(*pMin > mat[i][j]){
                *pMin = mat[i][j];
                *pI = i;
                *pJ = j;
            }
        }
    }
}

int main(void){

    float m[3][4], minimo;
    int indiceI, indiceJ;

    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
            scanf("%f",&m[i][j]);
        }
    } 

    printf("\n");

    min_matriz(m,&minimo,&indiceI,&indiceJ);

    printf("número:%.1f, índice i:%i índice j:%i",minimo,indiceI,indiceJ);
}