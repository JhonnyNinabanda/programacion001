package ejercicios.varios.vectores.matrices;

public class MainMatriz2 {

	public static void main(String[] args) {

		//1. Desarrolle un programa que imprima la siguiente imagen
		

		int B [][] = new int [5][5];
		
		for(int fila =0; fila<5; fila++) {
		for(int columna =0; columna<5; columna++) {
			if (fila == columna) {
				B [fila][columna]= 1;
			}else {
				B [fila][columna]= 0;
				}
			
			System.out.print(B[fila][columna] + " ");
				
			}
		System.out.println();
	}
		

}	
				
}		




