
public class Aritmetica {

	double operador1;
	double operador2;

	Aritmetica() {

	};

	Aritmetica(double a, double b) {

		this.operador1 = a;
		this.operador2 = b;

	}

	void suma() {

		double resul1 = this.operador1 + this.operador2;

		System.out.println("El resultado de la suma es: " + resul1);

	}

	void resta() {

		double resul1 = this.operador1 - this.operador2;

		System.out.println("El resultado de la resta es: " + resul1);

	}

	void multi() {

		double resul1 = this.operador1 * this.operador2;

		System.out.println("El resultado de la multiplicacion: " + resul1);

	}

	void div() {

		double resul1 = this.operador1 / this.operador2;

		System.out.println("El resultado de la division  es: " + resul1);
	}
}
