public class Carro {

    private String modelo;
    private String nome;
    private  Integer chassi;
    private  Integer ano;
    private  String cor;

    public Carro(){

    }
    public Carro(String modelo,String nome, Integer chassis, Integer ano, String cor){
        this.modelo = modelo;
        this.nome = nome;
        this.chassi = chassis;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo(){
        return modelo;

    }
    public String getNome(){
        return nome;

    }
    public  Integer getChassi(){
        return chassi;

    }
    public Integer getAno(){
        return ano;

    }
    public String getCor(){
        return cor;

    }

    public void setCor(String cor) {
        this.cor = cor;

    }
    @Override
    public String toString(){
        return "Informações do carro, moedelo: " + modelo + ", nome: " + nome + ", ano: "+ ano + ", chassi: " + chassi + ", cor: " + cor;

    }
    }

