package Exercicio2;

import dados.Veterinario;

public class SistemaPetShop {
    
    private Veterinario veterinarios[];
    private int quantidadeVeterinarios; 

    public void setVeterinario(Veterinario p){

        if(this.quantidadeVeterinarios < 5){
            veterinarios[this.quantidadeVeterinarios] = p;
            this.quantidadeVeterinarios++;
        }
    }

    public void setquantidadeVeterinarios(int quantidadeVeterinarios){
        this.quantidadeVeterinarios = quantidadeveterinarios;
    }

    public void setVeterinario(Veterinario veterinario, int quantidadeVeterinarios){
        veterinarios[quantidadeVeterinarios] = veterinario;
    }

    public Veterinario[] getVeterinarios(){
        return veterinarios;
    }

    public int getquantidadeVeterinarios(){
        return quantidadeVeterinarios;
    }

}
