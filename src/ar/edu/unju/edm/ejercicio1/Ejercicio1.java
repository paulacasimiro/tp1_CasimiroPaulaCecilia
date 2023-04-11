package ar.edu.unju.edm.ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int año=2010;
		
		añoBisiesto(año);
	}
	
	public static void añoBisiesto(int año) {
		if(año%4==0 && (año%100!=0 || año%400==0 )) {
			System.out.println("El año es Bisiesto");
		}
		else {
			System.out.println("El año NO es Bisiesto");
		}

	}
}
