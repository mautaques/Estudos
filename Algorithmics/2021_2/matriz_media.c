#include <stdio.h>
#define L 2
#define C 12

int main(void) {
  int l, c;
  float T[L][C] = {
      {29.3, 29.1, 28.2, 26, 23.8, 22.1, 21.3, 21.7, 22.6, 24.2, 26.3, 27.7},
      {21, 21.1, 20.1, 17.6, 15.3, 14, 12.9, 13.6, 15.1, 17, 18.5, 19.5},
    };
  float media;

  printf("\nMês Média da Temperatura");
  
  for ( c=0; c<C; c++){    
   for( l=0; l<1; l++){  
      media = (T[0][c]+T[1][c])/2; 
      printf("\n%d   %4.1f",c,media);
      }
 }
  return 0;
}