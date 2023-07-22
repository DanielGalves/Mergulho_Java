package fundamentos;

public class CalculadoraJurosCompostosMeta {
	public static void main(String Args[]) {
		double valorAcumulado = 10000;
		double valorMeta = 20000;
		double taxaJurosMensal = 0.8;
		int mes = 0;
		
		while(valorAcumulado < valorMeta) {
			mes++;		
			
			valorAcumulado += (valorAcumulado * taxaJurosMensal / 100);
			System.out.println("Mês " + mes + " = " + valorAcumulado);
			
		}
		
	}

}
