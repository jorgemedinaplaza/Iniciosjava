
public class Operadores {

	public static void main(String[] args) {
		// prueba de uso de operadores

		int num1 = 9;
		int num2 = 5;
		int num3 = 5;
		String nombre1 = "jorge Medina";
		String nombre2 = "jorge";

		boolean resultado, resultado2, resultcade;

		resultado = num1 == num2;
		resultado2 = num1 != num2;

		resultcade = nombre2.equals(nombre1);

		System.out.println("El resultado de la comparacion es : " + " " + resultado);

		System.out.print("El resultado de la comparacion es : " + " " + resultado2
				+ "  El resultado de comparar cadenas es: " + " " + resultcade);

		if (num1 % 2 == 0) {

			System.out.println("El numero es par");

		} else {

			System.out.println("El numero es impar");

		}

		if (num2 % num2 == 0 && num2 % 1 == 0) {

			System.out.println("El numero es primo");

		} else {
			System.out.println("El numero no es  primo");

		}

		String primo = (num3 % num3 == 0 && num3 % 1 == 0) ? "Es primo el numero" : "no es primo";

		System.out.println(primo);

	}
	
	
	
}
