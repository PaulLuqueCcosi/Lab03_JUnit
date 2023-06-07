
package src;

public class fibonacci {
	public static int nfibonancci(int n) {

		if(n > 46){
			throw new IllegalArgumentException("Posicion: Excede el tamanio del entero");
		}

		if (n < 0) {
			throw new IllegalArgumentException("Posicion: El argumento debe ser un numero no negativo.");
		}
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return nfibonancci(n - 1) + nfibonancci(n - 2);
	}

}
