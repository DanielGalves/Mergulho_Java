package fundamentos;

public class CalculadoraCortisol {
	
	public static void main(String Args[]) {
		double cortisol = 18.2;
		
		boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
		boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;
		//		boolean resultadoAnormal = !resultadoNormal;
		
		System.out.println("Resultado Normal: " + resultadoNormal);
		System.out.println("Resultado Anormal: " + resultadoAnormal);
		
	}

}
