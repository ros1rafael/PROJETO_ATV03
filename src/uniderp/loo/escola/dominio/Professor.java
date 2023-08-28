package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Professor extends Pessoa {

    private String registro;
    private LocalDate Datacontratacao;
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public LocalDate getDatacontratacao() {
        return Datacontratacao;
    }
    public void setDatacontratacao(LocalDate datacontratacao) {
        Datacontratacao = datacontratacao;
    }
    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao, String registro, LocalDate datacontratacao) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.registro = registro;
        Datacontratacao = datacontratacao;
    }
    public Professor(){
        
    }

    


    
}
