package pruebasPSejem;

public class fibonacci {
	public static int nfibonancci(int i) {
		
		if (i < 0) {
			throw new IllegalArgumentException("Posicion: El argumento debe ser un número no negativo.");
		}
		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;
		}
		return nfibonancci(i - 1) + nfibonancci(i - 2);	
	}

}
