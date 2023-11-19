package negocio;

import dados.Cliente;
import dados.Cidade;
import dados.Reserva;

import java.util.ArrayList;
import java.util.List;

public class ReservaPassagem {

    List<Cidade> cidades = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();

    int qntReservas = 0;

    public void cadastrarCidade(Cidade cidade){
        this.cidades.add(cidade);
    }

    public void cadastrarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void reservarIda(Cliente cliente, Reserva reserva){
        reserva.setNumReserva(this.qntReservas);
        this.qntReservas++;
        cliente.reservarIda(reserva);
    }

    public void reservarVolta(Cliente cliente, Reserva ida, Reserva volta){
        ida.setNumReserva(this.qntReservas);
        this.qntReservas++;

        volta.setNumReserva(this.qntReservas);
        this.qntReservas++;

        cliente.reservarVolta(ida, volta);
    }

    public Cliente buscarCliente(int cpf){
        for(Cliente c: this.clientes){
            if(c.getCpf() == cpf){
                return c;
            }
        }
        return null;
    }

    public List<Reserva> mostrarReservas(int cpfCliente){

        Cliente c = buscarCliente(cpfCliente);

        if(c != null){
            return c.getReservas();
        }
        return new ArrayList<Reserva>();
    }

    public List<Cliente> mostrarClientes(){
             return this.clientes;
    }

    public List<Cidade> mostrarCidades(){
            return this.cidades;
    }
}
