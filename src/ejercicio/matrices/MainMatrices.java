package ejercicio.matrices;

public class MainMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Declarar una matriz A de tipo char con 5 filas y 4 columnas.
		
		char A [][] = new char [5][4];

		//2. Declarar una matriz B de tipo char con 5 filas y 6 columnas.
		
		char B [][] = new char [5][6];
		
		//3. Declarar una matriz miMatriz  de tipo long  con 2 filas y 4 columnas.
		
		long miMatriz [][] = new long [2][4];
		
		//3. Declarar una matriz miMatriz1  de tipo long  con 1 filas y 2 columnas.
		// y asignar a la posicion [0][0] el valor de 2, 
		// posicion [1][1] el valor de 8 
		// posicion [2][2] el valor 2
		
		long miMatriz1 [][] = new long [1][2];
		
		miMatriz1 [0][0] = 2;
		miMatriz1 [1][1] = 8;  //error posicion no existe
		miMatriz1 [2][2] = 2;  //error posicion no existe 
		
		
	}

}
