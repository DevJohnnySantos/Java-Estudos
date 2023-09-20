package funcoes;

import exceptions.BusinessException;

public class Cliente {
    private Integer numero;
    private String nome;
    private Double saldo;
    private Double limiteSaque;
    public Cliente(){

    }
    public Cliente(Integer numero, String nome, Double saldo,Double limiteSaque){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNumero(){
        return  numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }
    public void deposito(Double quantidade){
        saldo += quantidade;
    }
    public void saque (double quantidade ){
        validarSaque(quantidade);
        saldo -= quantidade;
    }
   private void validarSaque(double quantidade){
        if (quantidade > getLimiteSaque()){
            throw new BusinessException("Erro ao realizar o saque, limite insuficiente");
        }
        if (quantidade > getSaldo()){
            throw  new BusinessException("Erro ao realizar o saque, saldo insuficiente");
        }
   }
}
