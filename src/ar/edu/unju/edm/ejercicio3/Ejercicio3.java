package ar.edu.unju.edm.ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=20;
		primosMenores(numero);
	}
	
	public static void primosMenores(int numero) {
		boolean primo;
		
		for (int num=0; num<=numero; num++) {
            primo = true;
            for (int i=num-1; i>1; i--) {
                if (num%i == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(num);
            }
        }
	}
}
