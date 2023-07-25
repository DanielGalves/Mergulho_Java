package OrientacaoObjetos.Banco;

public class Conta {
	
	Pessoa titular;
	int agencia;
	int numeroConta;
	double saldo;
	
	void depositar(double valor){
		
		if (valor <=0) {
			throw new IllegalStateException("Valor deve ser maior que zero!");	
		}
		
		saldo = saldo + valor;
		
	}
	
	void sacar (double valor) {
		if (valor <=0) {
			throw new IllegalStateException("Valor deve ser maior que zero!");	
		}
		if ( saldo - valor < 0) {
			throw new IllegalStateException("Saldo Insuficiente");			
		} else {
			saldo = saldo - valor;
		}
	}

}
