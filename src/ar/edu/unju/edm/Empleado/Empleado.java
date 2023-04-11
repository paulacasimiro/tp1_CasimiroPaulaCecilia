package ar.edu.unju.edm.Empleado;
import java.util.*;

	public class Empleado {
		private String Nombre;
		private Calendar FechaIngreso = Calendar.getInstance();
		private String Legajo;
		private String Email;
		private double Sueldo;
		private int HorasTrabajadas;

		public Empleado() {
			FechaIngreso.set(0,0,0);
			Email = "";
			Sueldo = 0.00;
		} 
		
		public Empleado(String Nombre, String Legajo, int HorasTrabajadas) {
			this.Nombre=Nombre;
			this.Legajo = Legajo;
			this.HorasTrabajadas = HorasTrabajadas;
			Sueldo=calcularSueldo(HorasTrabajadas);
		}
		
		public int calcularSueldo(int Horas) {
			int sueldo = 0;
			sueldo = Horas * 4000;
			if (Horas > 160) {
				sueldo = (Horas-160) * 5500 + 160 * 4000;
			}
			return sueldo;
		}
		
		public String getNombre() {
			return Nombre;
		}
		public String getFechaIngreso() {
			String fecha = (FechaIngreso.get(Calendar.DATE) + "/" + FechaIngreso.get(Calendar.MONTH) + "/" + FechaIngreso.get(Calendar.YEAR));
			return fecha;
		}
		public String getLegajo() {
			return Legajo;
		}
		public String getEmail() {
			return Email;
		}
		public double getSueldo() {
			return Sueldo;
		}
		public int getHorasTrabajadas() {
			return HorasTrabajadas;
		}
		
		public void setNombre(String NombreNuevo) {
			this.Nombre = NombreNuevo;
		}
		public void setFechaIngreso(int dia, int mes, int anio) {
			this.FechaIngreso.set(Calendar.YEAR, anio);
			this.FechaIngreso.set(Calendar.MONTH, mes);
			this.FechaIngreso.set(Calendar.DATE, dia);
		}
		public void setLegajo(String LegajoNuevo) {
			this.Legajo = LegajoNuevo;
		}
		public void setEmail(String EmailNuevo) {
			this.Email = EmailNuevo;
		}
		public void setHorasTrabajadas(int HorasNuevas) {
			HorasTrabajadas = HorasNuevas;
			Sueldo=calcularSueldo(HorasTrabajadas);
			System.out.println("Nombre: "+Nombre);
			System.out.println("Fecha de Ingreso: "+(FechaIngreso.get(Calendar.DATE) + "/" + FechaIngreso.get(Calendar.MONTH) + "/" + FechaIngreso.get(Calendar.YEAR)));
			System.out.println("Legajo: " + Legajo);
			System.out.println("Email: " + Email);
			System.out.println("Sueldo: " + Sueldo);
			System.out.println("Horas Trabajadas: " + HorasTrabajadas);
	}
}