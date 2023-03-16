package contas;
import agencias.Agencia;

public class Conta {
  private double saldo;
  private long numero;
  private Agencia agencia;

  public double getSaldo(){return saldo;}

  public void setSaldo(double saldo){this.saldo = saldo;}

  public long getNumero(){return numero;}

  public void setNumero(long numero){this.numero = numero;}

  public Agencia getAgencia(){return agencia;}

  public void setAgencia(Agencia agencia){this.agencia = agencia;}


  public Conta (double saldo, long numero, Agencia agencia ){
    super();
    this.saldo = saldo;
    this.numero = numero;
    this.agencia = agencia;
  }

  public double creditar(double valor){
    saldo += valor;

    return valor;
  }

  public double cdebita(double valor){
    saldo -= valor;

    return valor;
  }

  @Override
  public String toString() {
    return "Conta{" +
    "numero=" + numero + '\'' +
    ", saldo=" + saldo + '\''+
    ", agencia=" + agencia + 
    '}';
  }



}
