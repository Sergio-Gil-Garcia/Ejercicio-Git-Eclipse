package ejercicios;

public class Metodos {

	public static void main(String[] args) {
		
//		imprimirHolaMundo();
//		imprimirUnaLetraConChar();
//		imprimirUnNumeroConChar();
		variablesInt();
	}
	
	static void imprimirHolaMundo() {
		
		String palabra1 = "Hola";
		String palabra2 = "Mundo";
		System.out.println(palabra1 + " " + palabra2);
	}
	
	static void imprimirUnaLetraConChar() {
		
		char numero = 97;
		System.out.println(numero);
	}
	
	static void imprimirUnNumeroConChar() {
		
		char letra = 'a';
		double c = letra;
		System.out.println(c);
	}

	static void variablesInt() {
		
		int comienzo = 23;
		int resta = 2;

		for (int i = Math.abs(comienzo); i > 0; i -= Math.abs(resta)) {

			System.out.println(i);
		}
	}
}
