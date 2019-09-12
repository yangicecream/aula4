
package atividaderelacao;

public class Funcionario {
    private int codFuncionario;
    private String setor;
    private Banco banco;
    public void setCodFuncionario(int codFuncionario){
        this.codFuncionario = codFuncionario;
    }
    public int getCodFuncionario(){
        return this.codFuncionario;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
    public String getSetor(){
        return this.setor;
       
    }
    public void setBanco(Banco banco){
        this.banco = banco;
    }
    public Banco getBanco(){
        return this.banco;
    }
}
