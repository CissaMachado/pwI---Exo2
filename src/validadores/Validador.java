package validadores;


public interface Validador {
  //public boolean validar();

  public default boolean validar(String cpf){
    return false;
  }

}