
public class EjemploStatic {

	public static void main(String[] args) {

		Personas p1 = new Personas("Jorge", "Medina", "1127625712");
		System.out.println(p1.toString());
		Personas p2 = new Personas("Maria", "Perez", "1127625755");
		System.out.println(p2.toString());
		
		Personas p3 = new Personas("Maria", "Perez", "1127625755");

		System.out.println(p2.toString());
		
		System.out.println(p3.toString());
		
		System.out.println(Personas.id);

	}

}

class Personas {

	private String nombre;
	private String apellido;
	private String cedula;
	private int idpersona;

	public static int id;

	Personas() {
	};

	Personas(String nombre, String apellido, String cedula) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.idpersona = id++;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", id=" + idpersona
				+ "]";
	}

}