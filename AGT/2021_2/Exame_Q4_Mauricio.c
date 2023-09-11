#include <stdio.h>
#define L 7
#define C 5

int main(void) {

    int l, c;
    float N[L][C] = {
      {6, 10, 10, 5, 10},
      {4.5, 9, 8.5, 4, 10},
      {8, 9.5, 9, 3, 7},  
      {7.3, 8, 8.5, 4, 10},
      {8, 8.5, 7, 2, 8},
      {9, 7, 10, 6, 10},
      {4.5, 7.5, 9, 7, 9},
  };
    float mediaGeralC, mediaGeralA, mediaGeralG, mediaGeralE, mediaGeralL, mediaCal, mediaAlg, mediaGeo, mediaEdf, mediaLge;

      for(c=0; c<L; c++){    
         mediaCal += N[l][0];
         mediaAlg += N[l][1];
         mediaGeo += N[l][2];
         mediaEdf += N[l][3];
         mediaLge += N[l][4];
           
      }

  mediaGeralC = mediaCal/7;
  mediaGeralA = mediaAlg/7;
  mediaGeralG = mediaGeo/7;
  mediaGeralE = mediaEdf/7;
  mediaGeralL = mediaLge/7;

  printf("\nCálculo:");
          if(N[0][0] > mediaGeralC){
            printf(" 0,");
          }else{
          if(N[1][0] > mediaGeralC){
            printf(" 1,");
          }else{
          if(N[2][0] > mediaGeralC){
            printf(" 2,");
          }else{
          if(N[3][0] > mediaGeralC){
            printf(" 3,");
          }else{
          if(N[4][0] > mediaGeralC){
            printf(" 4,");
          }else{
          if(N[5][0] > mediaGeralC){
            printf(" 5,");
          }else{
          if(N[6][0] > mediaGeralC){
            printf(" 6,");
          }        
          }
          }
          }            
          }
          }
          }

  printf("\nAlgoritmos:");
          if(N[0][1] > mediaGeralA){
            printf(" 0,");
          }else{
          if(N[1][1] > mediaGeralA){
            printf(" 1,");
          }else{
          if(N[2][1] > mediaGeralA){
            printf(" 2,");
          }else{
          if(N[3][1] > mediaGeralA){
            printf(" 3,");
          }else{
          if(N[4][1] > mediaGeralA){
            printf(" 4,");
          }else{
          if(N[5][1] > mediaGeralA){
            printf(" 5,");
          }else{
          if(N[6][1] > mediaGeralA){
            printf(" 6,");
          }        
          }
          }
          }            
          }
          }
          }

  printf("\nGeometria:");
          if(N[0][2] > mediaGeralG){
            printf(" 0,");
          }else{
          if(N[1][2] > mediaGeralG){
            printf(" 1,");
          }else{
          if(N[2][2] > mediaGeralG){
            printf(" 2,");
          }else{
          if(N[3][2] > mediaGeralG){
            printf(" 3,");
          }else{
          if(N[4][2] > mediaGeralG){
            printf(" 4,");
          }else{
          if(N[5][2] > mediaGeralG){
            printf(" 5,");
          }else{
          if(N[6][2] > mediaGeralG){
            printf(" 6,");
          }        
          }
          }
          }            
          }
          }
          }

  printf("\nEd. Física:");
          if(N[0][3] > mediaGeralE){
            printf(" 0,");
          }else{
          if(N[1][3] > mediaGeralE){
            printf(" 1,");
          }else{
          if(N[2][3] > mediaGeralE){
            printf(" 2,");
          }else{
          if(N[3][3] > mediaGeralE){
            printf(" 3,");
          }else{
          if(N[4][3] > mediaGeralE){
            printf(" 4,");
          }else{
          if(N[5][3] > mediaGeralE){
            printf(" 5,");
          }else{
          if(N[6][3] > mediaGeralE){
            printf(" 6,");
          }        
          }
          }
          }            
          }
          }
          }

  printf("\nLíngua Estrang:");
          if(N[0][4] > mediaGeralL){
            printf(" 0,");
          }else{
          if(N[1][4] > mediaGeralL){
            printf(" 1,");
          }else{
          if(N[2][4] > mediaGeralL){
            printf(" 2,");
          }else{
          if(N[3][4] > mediaGeralL){
            printf(" 3,");
          }else{
          if(N[4][4] > mediaGeralL){
            printf(" 4,");
          }else{
          if(N[5][4] > mediaGeralL){
            printf(" 5,");
          }else{
          if(N[6][4] > mediaGeralL){
            printf(" 6,");
          }        
          }
          }
          }            
          }
          }
          }


  return 0;
}
