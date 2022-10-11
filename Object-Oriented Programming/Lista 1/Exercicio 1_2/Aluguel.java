package Exercicio1e2;

public class Aluguel {

        private int valor;
        private String horario;

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Aluguel(int valor, String horario){
        this.valor = valor;
        this.horario = horario;
    }

    public String toString(){
        return "Valor: "+ valor +"Horário: "+ horario;
    } 

    public boolean equals (Object objeto){
        Aluguel aluguel;
        if( ! (objeto instanceof Aluguel)){
            return false;
        }
        aluguel = (Aluguel) objeto;
        if(horario.equals(aluguel.getHorario())){
            return true;
        }
        return false;
    }

    public Aluguel(){
    }
}
