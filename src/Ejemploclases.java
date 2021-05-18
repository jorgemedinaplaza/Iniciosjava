
public class Ejemploclases {
	
	//definicion de atributos de la clase
	
	String nombre;
	String apellido;
	int cedula;
	
	//metodos de la clase
	
	
	Ejemploclases(){
		//constructor por defecto
		
	};
	
	
Ejemploclases(String nombre, String apellido){
	// constructor parametrico
	this.nombre=nombre;
	this.apellido=apellido;
		
		
	};
	
	
	void asignaNombre() {
		
		nombre="jorge";
		apellido="medina";
		cedula=1127625712;
		
	}
	
	
	void mostrarDatos() {
		
		
		System.out.println("El valor de los atributos es: "+"nombre: "+this.nombre+" apellido"+this.apellido+ "cedula: "+this.cedula);
	}

}
