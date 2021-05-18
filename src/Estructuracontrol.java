import java.util.*;

public class Estructuracontrol {

	public static void main(String[] args) {

		Scanner expresion = new Scanner(System.in);
		int a = 8;
		int b = 9;

		System.out.println("Bienvenido al menu de opciones");
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		System.out.println("Ingrese 1 para sumar dos numeros");
		System.out.println("********************************");
		System.out.println("Ingrese 2  para restar dos numeros");
		System.out.println("********************************");
		System.out.println("Ingrese 3  para dividir  dos numeros");
		System.out.println("********************************");

		int opcion = expresion.nextInt();

		switch (opcion) {

		case (1):

			int c = a + b;

			System.out.println("El resultado de la operacion de suma : " + " " + c);
			
			expresion.close();

			break;

		case (2):

			int d = a - b;

			System.out.println("El resultado de la operacion de resta es: " + " " + d);
			
			expresion.close();

			break;

		case (3):

			double e = a / b;

			System.out.println("El resultado de la operacion de division es: " + " " + e);
			
			expresion.close();

			break;
			
			
		}
		
	}

}
