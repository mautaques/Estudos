package Exercicio1e2;

import java.util.Scanner;

import Cliente;
import Endereco;
import Veiculo;
import sistemaAluguel;

public class Main {
    Scanner scan = new Scanner(System.in);
    Cliente cliente = new Cliente();
    Veiculo veiculo = new Veiculo();
    Endereco endereco = new Endereco();
    Aluguel aluguel = new Aluguel();
    
    cliente.setNome("Maurício");

    public void mostrarCliente(){
        System.out.println("Nome: "+cliente.getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Telefone: "+getTelefone());

    }

    public void mostrarVeiculo(){
        System.out.println("Marca: "+getMarca);
        System.out.println("Placa: "+getPlaca);
        System.out.println("Cor: "+getCor);

    }

    public void mostrarEndereco(){
        System.out.println("Rua: "+getRua);
        System.out.println("Número: "+getNumero);
        System.out.println("Bairro: "+getBairro);

    }

    public void Aluguel(){
        System.out.println("Valor: "+getValor);
        System.out.println("Horário: "+getHorario);

    }

    public static void main(String[] args){

        main.mostrarCliente();
        main.mostrarVeiculo();
        main.mostrarEndereco();
    }

}
