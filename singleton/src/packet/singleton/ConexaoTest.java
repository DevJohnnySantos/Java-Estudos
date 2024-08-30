package packet.singleton;

public class ConexaoTest {
    public static void main(String[] args) {
        Conexao conexao = Conexao.getInstance("safra");
        System.out.println(conexao.bancodados);
    }
}
