package fundamentos;

public class Fundamentos {
	
	public static void main(String args[]) {
		System.out.println("Olá Mergulhador!");
		
		String nomeCompleto;
		
		nomeCompleto = "João da Silva";
		
		System.out.println("Nome: " + nomeCompleto);
		
		int minhaIdade = 41;
		int suaIdade = 40;
		int totalIdades = minhaIdade + suaIdade;
		
		System.out.println("soma das Idades: " + totalIdades);
		
		double peso = 84.9d;
		System.out.println(peso);
		
		float taxa = 1_294.93f;
		
		boolean compraAprovada = false;
		System.out.println(compraAprovada);
		
		boolean maiorIdade = minhaIdade <= 42;
		System.out.println(maiorIdade);
		
		 maiorIdade = minhaIdade != 42;
		 System.out.println(maiorIdade);
		
	}

}
