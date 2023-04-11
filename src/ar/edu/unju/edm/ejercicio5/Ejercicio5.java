package ar.edu.unju.edm.ejercicio5;
import ar.edu.unju.edm.Empleado.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Empleado Empleado_1 = new Empleado();
		Empleado Empleado_2 = new Empleado("Emanuel","333",156);
		
		Empleado_1.setNombre("Abigail");
		Empleado_1.setFechaIngreso(03, 04, 2010);
		Empleado_1.setLegajo("111");
		Empleado_1.setEmail("abigail@gmail.com");
		
		System.out.println("Empleado 1: ");
		Empleado_1.setHorasTrabajadas(156);
		
		System.out.println("\nEmpleado 2: ");
		Empleado_2.setHorasTrabajadas(143);
		
	}
}
