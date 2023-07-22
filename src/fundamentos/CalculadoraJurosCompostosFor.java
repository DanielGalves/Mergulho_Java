package fundamentos;

public class CalculadoraJurosCompostosFor {
	public static void main(String Args[]) {
		double valorAcumulado = 10_000;
		double taxaJurosMensal = 0.8;
		int periodoAplicado = 12;
		
		for( int i = 1; i <= periodoAplicado; i++) {
			valorAcumulado = valorAcumulado *taxaJurosMensal /100;
			System.out.println("Mês " + i + " = " + valorAcumulado);
		}
		
		
	}

}
