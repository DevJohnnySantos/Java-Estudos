package br.com.cubosacademy.patterns.Factory.builder;

public class PacienteBuilder implements IPpacBuilder {
    private String nome;
    private String email;
    private Integer cpf;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setCpf(Integer cpf) {
       this.cpf = cpf;
    }
    public Paciente getResutl(){
        return new Paciente(nome, email, cpf);
    }
}
