package Ejercicio1;

public class Empleado {
	int id;
	String nombre;
	int edad;
	
	private static int cont = 999;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	 
	public Empleado() {
		cont++;
		
		this.nombre = "sin nombre";
		 this.edad = 99; 
		 this.id = cont;
	}
	
	public Empleado(String nombre, int edad) {
		cont++;
		
		this.edad = edad;
		this.nombre = nombre;
		this.id = cont;
	}
	
	@Override
	public String toString() {
		return "Empleado "+nombre+", edad:"+edad+", legajo:"+id;
	}
	
	public static int devuelveProximoID() {
		return cont+1;
	}
	
}
