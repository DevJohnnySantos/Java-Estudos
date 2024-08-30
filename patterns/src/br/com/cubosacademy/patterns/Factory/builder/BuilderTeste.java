package br.com.cubosacademy.patterns.Factory.builder;

public class BuilderTeste {
    public static void main(String[] args) {

       // Paciente joao = new Paciente("joao","","");
        PacienteBuilder builder = new PacienteBuilder();
        builder.setNome("joao");
        builder.setEmail("joao@gmial.com");
        builder.setCpf(Integer.valueOf("85"));

        Paciente joao = builder.getResutl();
        System.out.println(joao.relatorio());
    }
}
