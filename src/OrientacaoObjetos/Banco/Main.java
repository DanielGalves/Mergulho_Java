package OrientacaoObjetos.Banco;

public class Main {
	public static void main(String Args[]) {
		
		Pessoa titular1 = new Pessoa();
		titular1.setNome("João Pedro");
		titular1.setDocumento("125.896.785-79");
		
		Conta conta1 = new Conta();	
		conta1.setTitular(titular1);
		conta1.setAgencia(1010);
		conta1.setNumeroConta(1);
		conta1.setSaldo(1_000);
		
		System.out.println("Nome do Titular: " + conta1.getTitular().getNome());
		System.out.println("N° do Documento: " + conta1.getTitular().getDocumento());
		System.out.println("Agencia: " + conta1.getAgencia());
		System.out.println("Numero da conta: " + conta1.getNumeroConta());
		System.out.println("Saldo da conta: " + conta1.getSaldo() );
		System.out.println();
		
		
		conta1.depositar(20_000);
		System.out.println("Novo saldo apos deposito");
		System.out.println("Saldo da conta: " + conta1.getSaldo() );
		
		conta1.sacar(10000, 10);
		System.out.println("Novo saldo apos saque com taxa de saque");
		System.out.println("Saldo da conta: " + conta1.getSaldo() );
		
		
		System.out.println();System.out.println();
		Pessoa titular2 = new Pessoa();
		titular2.setNome("Maria Regina");
		titular2.setDocumento("589.654.726-89");
		
		Conta conta2 = new Conta();
		conta2.setTitular(titular2);
		conta2.setAgencia(1010);
		conta2.setNumeroConta(2);
		conta2.depositar(10_000);
		
		System.out.println("Nome do Titular: " + conta2.getTitular().getNome());
		System.out.println("N° do Documento: " + conta2.getTitular().getDocumento());
		System.out.println("Agencia: " + conta2.getAgencia());
		System.out.println("Numero da conta: " + conta2.getNumeroConta());
		System.out.println("Saldo da conta: " + conta2.getSaldo());
		System.out.println();
		
		conta2.sacar(5000);
		System.out.println("Novo saldo apos saque");
		System.out.println("Saldo da conta: " + conta2.getSaldo() );
		
		//saque com teste de exceptions
		//conta2.sacar(7000);
		//System.out.println("Novo saldo apos saque");
		//System.out.println("Saldo da conta: " + conta2.getSaldo());
		
		
		System.out.println();System.out.println();
		//Instanciando os objetos utilizando a sobrecarga dos construtores
		Pessoa titular3 = new Pessoa("Paulo Pimenta", "987.986.125-49");
		Conta conta3 = new Conta(titular3, 956, 3, 50_000);
		
		System.out.println("Nome do Titular: " + conta3.getTitular().getNome());
		System.out.println("N° do Documento: " + conta3.getTitular().getDocumento());
		System.out.println("Agencia: " + conta3.getAgencia());
		System.out.println("Numero da conta: " + conta3.getNumeroConta());
		System.out.println("Saldo da conta: " + conta3.getSaldo());
		System.out.println();
		
	}

}
