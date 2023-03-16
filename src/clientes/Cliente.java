package clientes;

import validadores.Validador;

public class Cliente implements Validador {

  private String nome;
  private String cpf;

 public Cliente(String nome, String cpf){

    super();
    this.nome = nome;
    this.cpf = cpf;
 };
 
 
  public String getNome(){return nome;}
  public void setNome(String nome){this.nome = nome;}

  public String getCpf(){return cpf;}
  public void setCpf(String cpf){this.cpf = cpf;}

  @Override
  public String toString() {
      return super.toString() + "\nNome:" + nome + "\n Cpf:" + cpf;
  }


  
  
}