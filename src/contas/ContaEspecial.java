package contas;

import java.util.List;

import agencias.Agencia;
import clientes.Cliente;

public class ContaEspecial extends Conta  {
  private double limite;
  private List<Cliente> clientes;

  public ContaEspecial(double saldo, long numero, Agencia agencia, double limite, List<Cliente> clientes) {
    super(saldo, numero, agencia);
    this.limite = limite;
    this.clientes = clientes;
  }
  
  public double getLimite(){ return limite;}
  public void setLimite(double limite){this.limite = limite;}

  public List<Cliente> getClientes(){return clientes;}
  public void setClientes(List<Cliente> clientes){ this.clientes = clientes;}

  public void adicionarCliente(Cliente c){
    this.clientes.add(c);
}
  
  @Override
  public String toString() {
      return "ContaEspecial{" +
              " Limite=" + limite +
              " Clientes=" + clientes +
              " Agencia  "+getAgencia()+
              " Saldo " +getSaldo()+
              " Numero "+getNumero();
  }

  
  
}