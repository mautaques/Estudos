#include <stdio.h>

int main(void) {
  int V[5], S[5], Soma[5], Sub[5], Multi[5], Div[5], v, s, r;

  for(v=0;v<5;v++){
    scanf("%i",&V[v]);
  }
  for(s=0;s<5;s++){
    scanf("%i",&S[s]);
  }
  for(r=0;r<5;r++){
    Soma[r] = V[r] + S[r];
    Sub[r] = V[r] - S[r];
    Multi[r] = V[r] * S[r];
    Div[r] = V[r] / S[r];
  }
  for(r=0;r<5;r++){
    printf("\n%i, ",Soma[r]);
    printf("%i, ",Sub[r]);
    printf("%i, ",Multi[r]);
    printf("%i, ",Div[r]);
  }
  return 0;
}