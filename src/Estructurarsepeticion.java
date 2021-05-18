
public class Estructurarsepeticion {

	public static void main(String[] args) {

		// estructura while

		int contador = 0;

		while (contador < 3) {

			contador++;

			System.out.println("Este es el ciclo numero:" + " " + contador);

		}

		do {

			contador++;

			System.out.println("Este es el ciclo numero:" + " " + contador);

		} while (contador < 3);
		

		for (int i = 0; i < 3; i++) {

			System.out.println("Este es el ciclo numero:" + " " + i);

		}

	}

}
