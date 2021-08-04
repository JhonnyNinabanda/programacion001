package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Declare un vector X [3] de tipo char y 
		// construya un programa que pida al usuario ingrese los valores para cada posicion
		// y finalmente que se imprima los valores ingresados
		
		
		char X [] = new char [3];
		char n;
		
		for (int i=0; i<3; i++) {
			
			System.out.println("Ingrese valor de la posicion: " +i);
			
			Scanner Lector = new Scanner(System.in);
			n = Lector.next().charAt(0);
			
			X[i]=n;
			
		}
	
		for (int i=0; i<3; i++) {
			
			System.out.println("El valor de la posicion: " +i);
			System.out.println(X[i]);
			
		}
	
	}

}
