package atividaderelacao;

public class Banco {

    private String nome;
    private int codBanco;
    private Funcionario funcionario;
    private Cliente cliente;

    public void setNome(String nome) {
        if (nome != "") {
            this.nome = nome;
        }

    }

    public String getNome() {
        return this.nome;
    }

    public void setCodBanco(int codBanco) {
        if(codBanco > 0)
        this.codBanco = codBanco;
    }

    public int getCodBanco(){
        return this.codBanco;
    }
    
    public void setFuncionario (Funcionario funcionario){
        this.funcionario = funcionario;
    }
    
    public Funcionario getFuncionario(){
        return this.funcionario;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
}

