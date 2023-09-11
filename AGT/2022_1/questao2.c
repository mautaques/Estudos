#include <stdio.h>

int main(void){

    int V1[10], V2[10], i, j, x, contadorV1=0, contadorV2=0;

    for(i=0;i<10;i++){
        scanf("%i",&V1[i]);
    }

    for(j=0;j<10;j++){
        scanf("%i",&V2[j]);
    }

    for(x=0;x<10;x++){
        if(V1[x] > V2[x]){
            contadorV1++;
        }else{
            if(V1[x] < V2[x]){
                contadorV2++;
            }
        }
    }

    printf("\nV1 = %i",contadorV1);
    printf("\nV2 = %i",contadorV2);

    if(contadorV1 > contadorV2){
        printf("\nV1 tem mais valores superiores");
    }else{
        if(contadorV1 < contadorV2){
            printf("\nV2 tem mais valores superiores");
        }
    }

    return 0;
}
