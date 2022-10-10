#include <stdio.h>

int main(void) {
int ultimoDigito, anoVeiculo;

  printf("Entre com dígito de seu veículo: \n");
  scanf("%d",&ultimoDigito);
  printf("Entre com o ano de seu veículo: \n");
  scanf("%d",&anoVeiculo);

  if(anoVeiculo >= 1980){

    if(anoVeiculo > 1980){

        if(ultimoDigito == 1){

          printf("Seu IPVA vence em Janeiro.\n");
          
        } else{
              if(ultimoDigito == 2){

                printf("Seu IPVA vence em Fevereiro.\n");
                
              } else{
                    if(ultimoDigito == 3){

                      printf("Seu IPVA vence em Março.\n");
                      
                    } else{
                          if(ultimoDigito == 4){

                            printf("Seu IPVA vence em Abril.\n");
                            
                          } else{

                                if(ultimoDigito == 5){

                                  printf("Seu IPVA vence em Maio.\n");
                                  
                                } else{

                                      if(ultimoDigito == 6){

                                        printf("Seu IPVA vence em Junho.\n");
                                        
                                      } else{

                                            if(ultimoDigito == 7){

                                              printf("Seu IPVA vence em Julho.\n");

                                            } else{

                                                  if(ultimoDigito == 8){

                                                    printf("Seu IPVA vence em Agosto.\n");
                                                    
                                                  } else{

                                                        if(ultimoDigito == 9){

                                                          printf("Seu IPVA vence em Setembro.\n");
                                                          
                                                        } else{

                                                              if(ultimoDigito == 0){

                                                                printf("Seu IPVA vence em Outubro.\n");
                                                                
                                                              }

                                                          
                  }

                                                    
                }

                          
              }

                            
            }

          
          }

                            
        }

                      
      }

          
    }

          
  }

      
    } else{

          if(ultimoDigito == 1){

          printf("Seu IPVA vence em Janeiro. Esse é seu último ano de pagar IPVA.\n");
          
        } else{
              if(ultimoDigito == 2){

                printf("Seu IPVA vence em Fevereiro. Esse é seu último ano de pagar IPVA.\n");
                
              } else{
                    if(ultimoDigito == 3){

                      printf("Seu IPVA vence em Março. Esse é seu último ano de pagar IPVA.\n");
                      
                    } else{
                          if(ultimoDigito == 4){

                            printf("Seu IPVA vence em Abril. Esse é seu último ano de pagar IPVA.\n");
                            
                          } else{

                                if(ultimoDigito == 5){

                                  printf("Seu IPVA vence em Maio. Esse é seu último ano de pagar IPVA.\n");
                                  
                                } else{

                                      if(ultimoDigito == 6){

                                        printf("Seu IPVA vence em Junho. Esse é seu último ano de pagar IPVA.\n");
                                        
                                      } else{

                                            if(ultimoDigito == 7){

                                              printf("Seu IPVA vence em Julho. Esse é seu último ano de pagar IPVA.\n");

                                            } else{

                                                  if(ultimoDigito == 8){

                                                    printf("Seu IPVA vence em Agosto. Esse é seu último ano de pagar IPVA.\n");
                                                    
                                                  } else{

                                                        if(ultimoDigito == 9){

                                                          printf("Seu IPVA vence em Setembro. Esse é seu último ano de pagar IPVA.\n");
                                                          
                                                        } else{

                                                              if(ultimoDigito == 0){

                                                                printf("Seu IPVA vence em Outubro.Esse é seu último ano de pagar IPVA.\n");
                                                                
                                                              }

                                                          
                  }

                                                    
                }

                          
              }

                            
            }

          
          }

                            
        }

                      
      }

          
    }

          
  }



    }

    
            } else{
        
                  printf("Seu veículo está isento de IPVA.\n");
        
            
            }
          
        
          return 0;
        }