
public class Encapsulamiento {

	public static void main(String[] args) {
		
		Persona p1=new Persona("Jorge","Medina",1127625712);
		
		System.out.println(p1.toString());
		
		p1.setNombre("Mario");
		p1.setApellido("Correa");
		p1.setCedula(134526273);
		
		System.out.println(p1.toString());
		
	}
	
	
	
 	
		
		
	}
class Persona {
	 
	 private String nombre;
	 private String apellido;
	 private double cedula;
	 
	 
	 public Persona() {};
	 
	 public  Persona(String a, String b, double c) {
		 
		 this.nombre=a;
		 this.apellido=b;
		 this.cedula=c;
	 }
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getCedula() {
		return cedula;
	}
	public void setCedula(double cedula) {
		this.cedula = cedula;
	}
}

