package testes;

import java.util.ArrayList;

import agencias.Agencia;
import clientes.Cliente;
import contas.ContaEspecial;

public class teste1 {
  public static void main(String[] args) {
   ArrayList<Cliente> clientes =  new ArrayList<Cliente>();
   Cliente c = new Cliente("cecilia", "86796984072");
   clientes.add(c);

   System.out.println(clientes);

   Agencia a = new Agencia("rua salvaodr dalli", 200);
   ContaEspecial ce = new ContaEspecial(500.00, 200, a, 200, clientes);

   System.out.println(ce.toString());
   ce.creditar(200);
   System.out.println(ce.toString());
  }
}
