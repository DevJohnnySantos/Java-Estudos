package entidade;

public class ContaPj extends  Conta{
    private double limiteEmprestimo;

    public ContaPj(){
        super();

    }
    public ContaPj(int numero, String nome, double saldo, double limiteEmprestimo){
        super(numero, nome, saldo);
        this.limiteEmprestimo = limiteEmprestimo;

    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    public  void emprestimo(double quantidade){
        if (quantidade <= limiteEmprestimo){
            saldo += quantidade -10.0;
        }
    }

    @Override
    public void saque (double quantidade){
        super.saque(quantidade);
        saldo -= 2.0;
    }
}
