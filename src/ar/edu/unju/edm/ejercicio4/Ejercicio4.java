package ar.edu.unju.edm.ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroA=5;
		int numeroB=20;
		String opcion="IMPAR";
		
		parImpar(numeroA,numeroB,opcion);
	}
	
	public static void parImpar(int numeroA, int numeroB, String opcion) {
		
		if(opcion=="PAR") {
			for (int num=numeroA; num<=numeroB; num++) {
				if (num%2 == 0) {
					System.out.println(num);
	            }
	        }
		}
		else if(opcion=="IMPAR") {
			for (int num=numeroA; num<=numeroB; num++) {
				if (num%2 != 0) {
					System.out.println(num);
	            }
	        }
		}
	}
}
