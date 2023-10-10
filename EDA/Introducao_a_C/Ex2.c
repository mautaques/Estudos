#include <stdio.h>
#include <stdlib.h>

int main() {
    int n,k;

    printf("Informe o tamanho do vetor: ");
    scanf("%d", &n);

    int v[n];
    int r[n];
    
    for (int i = 0; i < n; i++) {
        printf("Informe o número %d do vetor: ", i + 1);
        scanf("%d", &v[i]);
        r[i] = 1;
    }

    printf("[ ");
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i != j) {
                r[i] *= v[j];
            }
        }

        printf("%d ", r[i]);
    }

    printf("]\n");
}
