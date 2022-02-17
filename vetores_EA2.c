#include <stdio.h>

int main(void) {

  int A[6], B[6]; 
  int  a, b, contador01=0, contador02=0, contador11=0, contador12=0, contador21=0, contador22=0;
  int contador31=0, contador32=0, contador41=0, contador42=0, contador51=0, contador52=0;

    printf("\nDigite valores para o vetor A:");
    for(a=0;a<6;a++){
      printf("\nValores para A[%d]:",a);
      scanf("%d",&A[a]);
    }
    printf("\nDigite valores para o vetor B:");
    for(b=0;b<6;b++){
      printf("\nValores para B[%d]:",b);
      scanf("%d",&B[b]);
    }
        
    for(b=0; b<6; b++){    
      
    if(A[0] == B[b]){
      contador01 = contador01 + 1;
    }else{
     }
    if(A[0] < B[b]){
      contador02 = contador02 + 1;
    }   
   }   
  
  for(b=0; b<6; b++){    
        
      if(A[1] == B[b]){
        contador11 = contador11 + 1;
      }else{
       }
      if(A[1] < B[b]){
        contador12 = contador12 + 1;
      }   
     }   

  for(b=0; b<6; b++){    
        
      if(A[2] == B[b]){
        contador21 = contador21 + 1;
      }else{
       }
      if(A[2] < B[b]){
        contador22 = contador22 + 1;
      }   
     }   

  for(b=0; b<6; b++){    
      
    if(A[3] == B[b]){
      contador31 = contador31 + 1;
    }else{
     }
    if(A[3] < B[b]){
      contador32 = contador32 + 1;
    }   
   }   

  for(b=0; b<6; b++){    
      
    if(A[4] == B[b]){
      contador41 = contador41 + 1;
    }else{
     }
    if(A[4] < B[b]){
      contador42 = contador42 + 1;
    }   
   }   

  for(b=0; b<6; b++){    
      
    if(A[5] == B[b]){
      contador51 = contador51 + 1;
    }else{
     }
    if(A[5] < B[b]){
      contador52 = contador52 + 1;
    }   
   }   
  
   printf("\nA[0]= %d  Total iguais em B= %d; Total de maiores em B= %d",A[0],contador01,contador02);
   printf("\nA[1]= %d  Total iguais em B= %d; Total de maiores em B= %d",A[1],contador11,contador12);
   printf("\nA[2]= %d  Total iguais em B= %d; Total de maiores em B= %d",A[2],contador21,contador22);
   printf("\nA[3]= %d  Total iguais em B= %d; Total de maiores em B= %d",A[3],contador31,contador32);
   printf("\nA[4]= %d  Total iguais em B= %d; Total de maiores em B= %d",A[4],contador41,contador42);
   printf("\nA[5]= %d  Total iguais em B= %d; Total de maiores em B= %d",A[5],contador51,contador52);
  return 0;
}
