package br.com.cubosacademy.patterns.Factory.builder;

public class Paciente {
    private String nome;
    private String email;
    private Integer cpf;

    public Paciente(String nome, String email, Integer cpf) {
    }

    public Paciente(String joao, String email, String s) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String relatorio(){
        String ficha = "Ficha do paciente: \n";

        if (this.nome != null) {
            ficha += "Nome: " + this.nome + "\n";
        }
       if (this.cpf != null) {
           ficha += "Nome: " + this.cpf + "\n";
       }
       if (this.email != null) {
           ficha += "Nome: " + this.email + "\n";
       }
        return ficha;
    }
}
