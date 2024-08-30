package packet.singleton;

public final class Conexao {
  private static Conexao instancia;

  public String bancodados;
  private Conexao(String bancodados){
      this.bancodados =bancodados;

  }
  public static Conexao getInstance(String bancodados){
      if (instancia == null ){
        instancia = new Conexao(bancodados);
      }
      return instancia;
  }


}
