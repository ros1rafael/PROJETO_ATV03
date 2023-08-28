package uniderp.loo.escola.dominio;
import java.time.LocalDate;

public class Aluno extends Pessoa {

    private String matricula;
    private LocalDate datamatricula;
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDatamatricula() {
        return datamatricula;
    }
    public void setDatamatricula(LocalDate datamatricula) {
        this.datamatricula = datamatricula;
    }
    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao, String matricula, LocalDate datamatricula) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.matricula = matricula;
        this.datamatricula = datamatricula;
    }
    
    public Aluno(){
        
    }

 
    
}
