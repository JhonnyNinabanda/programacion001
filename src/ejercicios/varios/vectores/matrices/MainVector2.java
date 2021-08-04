package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. declare un vector X cuya longuitud se solicite al usuario, de tipo int
				// y construya un programa que pida al usuario ingrese los valores para cada posicion
				// y finalmente que se imprima los valores ingresados
			
				Scanner Lector = new Scanner(System.in);
				
				int N;
				
				System.out.print("Ingrese la longuitud del vector: ");

				N = Lector.nextInt();
				
				int X [] = new int [N];
				
				int n;
				
				for (int i=0; i<N; i++) {
					
					System.out.println("Ingrese valor de la posicion: " +i);
					
					
					n = Lector.nextInt();
					
					X[i]=n;
					
				}
			
				for (int i=0; i<3; i++) {
					
					System.out.println("El valor de la posicion: " +i);
					System.out.println(X[i]);
					
				}
			
				
				
		
		
	}

}
