package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado[] empleados = crearEmpleados(9);
		empleados = asignarValoresEmpleados(empleados);
		mostrarInfoEmpleados(empleados);
	}
	
	private static Empleado[] crearEmpleados(int cant) {
		return new Empleado[cant];
	}
	
	private static Empleado[] asignarValoresEmpleados(Empleado[] lista) {
		
		for(int i = 0; i < lista.length; i++) {
			
			if(i == lista.length/2 || (i == (lista.length/2-3))) {
				lista[i] = new Empleado();
				System.out.println(Empleado.devuelveProximoID());
			}
			else if(i == (lista.length/2+3)) {
				lista[i] = new Empleado();
				lista[i].setNombre("NombreSet");
				lista[i].setEdad(22);
				System.out.println(Empleado.devuelveProximoID());
			}
			else
				lista[i] = new Empleado(String.format("Nombre %d", (i+1)), i);
		}
		return lista;
	}

	private static void mostrarInfoEmpleados(Empleado[] lista) {
		
		for(int i = 0; i < lista.length; i++) {	
			System.out.println(lista[i].toString());
		}
		System.out.println(Empleado.devuelveProximoID());
	}
}
