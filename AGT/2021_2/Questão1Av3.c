#include <stdio.h>
#define L 3
#define C 12

int main(void) {
  int l, c;
  float T[L][C] = {
      {29.3, 29.1, 28.2, 26, 23.8, 22.1, 21.3, 21.7, 22.6, 24.2, 26.3, 27.7},
      {21, 21.1, 20.1, 17.6, 15.3, 14, 12.9, 13.6, 15.1, 17, 18.5, 19.5},
      {258, 234, 216, 122.1, 111.3, 98.6, 107.7, 98, 137, 173.4, 159, 208.1},  
  };
  float mediaMin, mediaMax, mediaP, somaMin = 0, somaMax = 0, somaP = 0;

  printf("\nT.Max  T.Mín  Precipitação");
  
 for ( c=0; c<C; c++){    
   somaMin += T[0][c];
   somaMax += T[1][c];
   somaP += T[2][c];
     
 }

  printf("\n%.1f   %.1f   %.1f",somaMin/12,somaMax/12,somaP/12);

  return 0;
}
