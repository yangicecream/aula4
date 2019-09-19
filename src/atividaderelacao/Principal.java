package atividaderelacao;

public class Principal {

    public static void main(String[] args) {
        Banco bank1= new Banco ();
        bank1.setNome("BancoItau");
        bank1.setCodBanco(1);
        
        Funcionario funcio1 = new Funcionario ();
        Cliente cliente1 = new Cliente();
        bank1.setCliente(cliente1);
        bank1.setFuncionario(funcio1);
        funcio1.setSetor("informatica");
        funcio1.setBanco(bank1);
        funcio1.setCodFuncionario(1);
        funcio1.setNome("Lolly");
        funcio1.setIdade(18);
        funcio1.setCpf("55552252512");
        
        System.out.println(funcio1.getBanco());
        System.out.println(funcio1.getSetor());
        System.out.println(funcio1.getCodFuncionario());
        System.out.println(funcio1.getNome());
        System.out.println(funcio1.getIdade());
        System.out.println(funcio1.getCpf());
        
        cliente1.setCodCliente(6);
        cliente1.setBanco(bank1);
        cliente1.setCredito(1);
        cliente1.setNome("Julio");
        cliente1.setIdade(18);
        cliente1.setCpf("55552256892");
        
        System.out.println(cliente1.getBanco());
        System.out.println(cliente1.getCodCliente());
        System.out.println(cliente1.getCredito());
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getIdade());
        System.out.println(cliente1.getCpf());
        
    }
    
}
