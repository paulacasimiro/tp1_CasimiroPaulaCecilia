package ar.edu.unju.edm.ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=10;
		queMes(numero);
	}
	
	public static void queMes(int numero) {
		String mes = "";
		switch(numero){
			case 1: mes="Enero";
			break;
			case 2: mes="Febrero";
			break;
			case 3: mes="Marzo";
			break;
			case 4: mes="Abril";
			break;
			case 5: mes = "Mayo";
			break;
			case 6: mes = "Junio";
			break;
			case 7: mes = "Julio";
			break;
			case 8: mes= "Agosto";
			break;
			case 9: mes = "Septiembre";
			break;
			case 10: mes = "Octubre";
			break;
			case 11: mes = "Noviembre";
			break;
			case 12: mes = "Diciembre";
			break;
			default: mes = "No existe ese mes";
			
		}
		System.out.println(mes);
	}
}
