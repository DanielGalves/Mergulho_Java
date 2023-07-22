package OrientacaoObjetos.Banco;

public class Main {
	public static void main(String Args[]) {
		
		Conta conta1 = new Conta();
		conta1.nomeTitular = "João Pedro";
		conta1.agencia = 1010;
		conta1.numeroConta = 1;
		conta1.saldo = 1_000;
		
		System.out.println("Nome do Titular: " + conta1.nomeTitular);
		System.out.println("Agencia: " + conta1.agencia);
		System.out.println("Numero da conta: " + conta1.numeroConta);
		System.out.println("Saldo da conta: " + conta1.saldo);
		
		
		Conta conta2 = new Conta();
		conta2.nomeTitular = "Maria Regina";
		conta2.agencia = 1010;
		conta2.numeroConta = 2;
		conta2.saldo = 10_000;
		
		System.out.println("Nome do Titular: " + conta1.nomeTitular);
		System.out.println("Agencia: " + conta1.agencia);
		System.out.println("Numero da conta: " + conta1.numeroConta);
		System.out.println("Saldo da conta: " + conta1.saldo);
				
		
	}

}
