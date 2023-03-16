package testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import agencias.Agencia;
import clientes.Cliente;
import contas.ContaEspecial;


// menu ***sem a validaão do cpf e sem Utilizar ENUM***

public class Menu {

  public static void main(String[] args) {
    ArrayList<ContaEspecial> contas = new ArrayList<ContaEspecial>();

    while (true) {
      switch (montaMenu()) {
        case 1: // Cadastrar uma conta Especial
          ArrayList<Cliente> clientes = new ArrayList<Cliente>();
          for (int i = 0; i < 1; i++) {
            clientes.add(new Cliente(JOptionPane.showInputDialog("Insira o CPF do cliente?"),
                JOptionPane.showInputDialog("Insira o nome do cliente? ")));
          }
        contas.add(
          new ContaEspecial(
            Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo atual do Cliente")), 
            Long.parseLong(JOptionPane.showInputDialog("Informe o número da conta do cliente")),
            new Agencia(
              JOptionPane.showInputDialog("Informe o endereço do cliente"), 
              Integer.parseInt(JOptionPane.showInputDialog("Informe o número da agência do cliente"))
              ), 
            Double.parseDouble(JOptionPane.showInputDialog("Informe o atual limite do cliente")), 
            clientes)
        );
          break;
          case 2: //Pesquisa de conta especial por número
            boolean flag = false; // nesse caso a flag ou bandeira está servindo para indicar ou não a ocorrencia de um fato
            if(contas!=null & contas.isEmpty()){
                long numPesq = Long.parseLong(JOptionPane.showInputDialog("Informe o numero da conta do cliente para pesquisa"));
                for(ContaEspecial conta: contas){
                    if(conta!=null && conta.getNumero()==numPesq){
                       JOptionPane.showConfirmDialog(null, "A conta informada já está cadastrada no sistema");   
                       flag = true;
                      }
                }
            }
            if(!flag){
              JOptionPane.showConfirmDialog(null,"A número de conta informado no existe");
            }
          break;
          case 3: // buscar numero de agencia relacionada a determinada conta especial
          flag = false;
          if(contas!=null && contas.isEmpty()){
            int numPes = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da agencia do cliente para pesquisa"));
            for(ContaEspecial conta : contas){
                if(conta!=null && conta.getNumero()==numPes){
                  JOptionPane.showConfirmDialog(null, "A agencia informada pertence a conta: " + conta.getAgencia().toString());
                  flag = true;
                }
            }
          }
          if(!flag){
            JOptionPane.showMessageDialog(null,"Conta não existe");
          }
          break;
          case 4:
          break;
          case 5:
          break;
          case 6: System.exit(0);
          break;
      }
    }
  }

  public static int montaMenu() {
    String menu = 
        "1 - Cadastrar Conta especial \n" +
        "2 - Pesquisar Conta Especial usando número\n" +
        "3 - Pesquisar Conta Especial usando número da agência\n" +
        "4 – Pesquisar Conta Especial usando o CPF do cliente\n" +
        "5 - Listar todos\n" +
        "6 - Sair ";
    return Integer.parseInt(JOptionPane.showInputDialog(menu));
  }
}
