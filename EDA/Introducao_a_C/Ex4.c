#include <stdio.h>
#include <stdlib.h>

int main(void){

    int n, i, j, sum1 = 0, sum2 = 0;

    printf("Digite um número: \n");

    scanf("%d",&n);

    int m[n][n];

    printf("Digite elementos para a matriz: \n");

    for(i = 0; i < n; i++){
        for(j = 0; j < n; j++){
            scanf("%d",&m[i][j]);
        }
    }

    for(i = 0; i < n; i++){
        sum1 += m[i][i];
        sum2 += m[n - 1 - i][i];
    }

    printf("O somatório da diagonal primaria é: %d\n",sum1);
    printf("O somatório da diagonal secundaria é: %d\n",sum2);

    return 0;
}