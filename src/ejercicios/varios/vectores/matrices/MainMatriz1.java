package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		
		// 1. Declare un matriz A [3,4] de tipo char y desarrolle un programa que vaya solicitando
		// cada una de sus posiciones.
		
		Scanner Lector = new Scanner(System.in);
		
		char A [][] = new char [3][4];
		
		for(int fila =0; fila<3; fila++) {
		for(int columna =0; columna<4; columna++) {
				
		System.out.print("Ingrese valor de la fila: " +fila+ " columna: " + columna + " : ");
		// El usuario da el valor por teclado
		char n = Lector.next().charAt(0);
		A[fila][columna] = n;
				
			}
		}
		for(int fila =0; fila<3; fila++) {
			for(int columna =0; columna<4; columna++) {
					
			System.out.print(A[fila][columna] + " ");
	}
			System.out.println();
}	
}
}
