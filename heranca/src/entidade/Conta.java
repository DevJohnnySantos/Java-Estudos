package entidade;

public class Conta {
    private int numero;
    private String nome;
    protected double saldo;

    public Conta(){

    }
    public Conta(int numero, String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }


    public void saque (double quantidade){
          saldo -= quantidade;
    }
    public  void  deposito(double quantidade){
        saldo += quantidade;
    }
}
