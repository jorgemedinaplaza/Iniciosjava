
public class EjemploArreglos {

	public static void main(String[] args) {
	
		//declaracion de arreglos
		
		int ar1 [];  //arreglo de int
		
		Ejemploclases ar2[]; //arreglo de objectos
		
		//instaciacion de arreglos
		
		
	 ar1=new int[12]; // asigno tamaño de 12 al arreglo
	 ar2=new Ejemploclases[3]; //asigno tamaño de 3 al areglo de objectos
	 
	 
	//asignacion de valores
	 
	 
	 ar1[1]=23;
	 ar1[2]=2;
	 ar2[1]=new Ejemploclases();
	 ar2[2]=new Ejemploclases("jorge","medina");
	 
	 Ejemploclases p1=ar2[1];
	 Ejemploclases p2=ar2[2];
	 
	 
	 System.out.println("El arreglo es la posicion 1 tiene un valor de: "+ar1[1]);
	 System.out.println("El arreglo es la posicion 2 tiene un valor de: "+ar1[2]);
	 System.out.println("El arreglo de objectos es la posicion 1 tiene un valor de: ");
	 p1.mostrarDatos();
	 System.out.println("El arreglo de objectos es la posicion 2 tiene un valor de: ");
	 p2.mostrarDatos();


	 //inicializar un arreglo automaticamente
	 
	 
	 for(int i=0; i<ar1.length;i++) {
		 
		 ar1[i]=22;
		 
		 for (int m=0;m <ar1.length; m++) {
		 
		
		 System.out.println("El arreglo es la posicion  " +m+"  tiene un valor de: "+ar1[m]);
		 
		 
		 
		 
	 }
	 
	 }
		 
		
	}

}
