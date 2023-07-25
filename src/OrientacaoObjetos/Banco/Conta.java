package OrientacaoObjetos.Banco;

import java.util.Objects;

public class Conta {
	
	Pessoa titular;
	int agencia;
	int numeroConta;
	double saldo;
	
	Conta(Pessoa titular, int agencia, int numeroConta, double saldo){
		Objects.requireNonNull(titular);
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;		
	}
	
	Conta(){
		
	}
	
	void depositar(double valor){
		
		if (valor <=0) {
			throw new IllegalStateException("Valor deve ser maior que zero!");	
		}
		
		saldo = saldo + valor;
		
	}
	
	void sacar(double valor) {
		if (valor <=0) {
			throw new IllegalStateException("Valor deve ser maior que zero!");	
		}
		if ( saldo - valor < 0) {
			throw new IllegalStateException("Saldo Insuficiente");			
		} else {
			saldo = saldo - valor;
		}
	}

	void sacar(double valor, double taxaSaque) {
		sacar(valor + taxaSaque);
		
	}
	
}
