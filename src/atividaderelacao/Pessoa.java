package atividaderelacao;


public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    public void setNome(String nome){
        if(nome != ""){
         this.nome = nome;
    }
    
}

   public String getNome(){
    return this.nome;
   }

    public void setIdade (int idade){
         if(idade > 0){
         this.idade = idade;
}
    }
    public int getIdade(){
    return this.idade;
}

    public void setCpf (String Cpf){
    if(cpf != ""){
         this.cpf = cpf;
}
    }
    public String getCpf(){
    return this.cpf; 
}
}

