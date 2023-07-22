package OrientacaoObjetos.Banco;

public class Main {
	public static void main(String Args[]) {
		
		Pessoa titular1 = new Pessoa();
		titular1.nome = "João Pedro";
		titular1.documento = "125.896.785-79";
		
		Conta conta1 = new Conta();	
		conta1.titular = titular1;
		conta1.agencia = 1010;
		conta1.numeroConta = 1;
		conta1.saldo = 1_000;
		
		System.out.println("Nome do Titular: " + conta1.titular.nome);
		System.out.println("N° do Documento: " + conta1.titular.documento);
		System.out.println("Agencia: " + conta1.agencia);
		System.out.println("Numero da conta: " + conta1.numeroConta);
		System.out.println("Saldo da conta: " + conta1.saldo );
		System.out.println();
		
		Pessoa titular2 = new Pessoa();
		titular2.nome = "Maria Regina";
		titular2.documento = "589.654.726-89";
		
		Conta conta2 = new Conta();
		conta2.titular = titular2;
		conta2.agencia = 1010;
		conta2.numeroConta = 2;
		conta2.saldo = 10_000;
		
		System.out.println("Nome do Titular: " + conta2.titular.nome);
		System.out.println("N° do Documento: " + conta2.titular.documento);
		System.out.println("Agencia: " + conta2.agencia);
		System.out.println("Numero da conta: " + conta2.numeroConta);
		System.out.println("Saldo da conta: " + conta2.saldo);
		System.out.println();
				
		
	}

}
