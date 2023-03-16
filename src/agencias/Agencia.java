package agencias;

public class Agencia {
  private int numero;
  private String endereco;

  
  public Agencia(String endereco, int numero){
    super();
    this.endereco = endereco;
    this.numero = numero;
  }

  public String getEndereco(){
    return endereco;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }

  public int getNumero(){
    return numero;
  }

  public void setNumero(int numero){
    this.numero = numero;
  }

  @Override
  public String toString() {
    return "Agencia{" +
              "numero='" + numero + '\'' +
              ", endereco=" + endereco +
              '}';
   }
  
  }
 

