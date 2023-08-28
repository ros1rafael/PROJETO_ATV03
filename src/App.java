import java.time.LocalDate;
import uniderp.loo.escola.dominio.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello,");

  
        Professor P1 = new Professor();
        P1.setCodigo(0);
        P1.setNome("Rafael");
        P1.setEndereco("Rua 123");
        P1.setTelefone("40028922");
        P1.setDataNascimento(LocalDate.of(2004, 6, 10));
        P1.setRg("123456");
        P1.setCpf("87654321");
        P1.setDataInsercao(LocalDate.now());
        P1.setDatacontratacao(LocalDate.of(2018, 04, 01));
        P1.setRegistro("154654");

        
}
}