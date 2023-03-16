package testes;

public enum OpcoesMenu {
  CAD (1, "– Cadastrar Conta Especial"),
  PESQ_NUM (2, "-Pesquisar Conta Especialusando número"),
  PESQ_AG (3, "-Pesquisar Agencia usando número"),
  PESQ_CPF (4, "-Pesquisar Conta Especial usando cpf"),
  LIST (5, "-Listar todos"),
  SAIR (6, "-Sair");

  private int numMenu;
  private String textoMenu;
  private OpcoesMenu(int numMenu, String textoMenu){
    this.numMenu = numMenu;
    this.textoMenu = textoMenu;
  };
  public int getNumMenu(){
    return numMenu;
  };
  public String getTextoMenu(){
    return textoMenu;
  }

}

