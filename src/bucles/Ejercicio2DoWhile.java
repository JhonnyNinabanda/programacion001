package bucles;

import java.util.Scanner;

public class Ejercicio2DoWhile {

	public static void main(String[] args) {

				// Crear un programa que solicite ingresar un número (solo positivos), 
				// y así seguirá solicitando ingresar un número hasta que se ingrese el número (-1),
				// cuando se ingrese el numero -1, ya no solicitará más números y en ese momento 
				// el programa debe imprimir la suma solo de los números pares ingresados y 
				// el promedio solo de los números impares ingresados hasta ese momento.
				
				Scanner Lector = new Scanner(System.in);
				
				System.out.println("Programa de la  Prueba 2");
				System.out.println("========================");
				System.out.println(" ");
				
				int N=0; 
				int SP = 0;
				int SI =0;
				int CI = 0;
				float PI = 0;
				
				do {
					System.out.print("Ingrese un numero positivo: ");
					N = Lector.nextInt();
					
					if (N%2==0) {
						SP =SP+N;
						
					}else{
						
						SI = SI + N;
						CI = CI+1;
						PI = (float) SI/CI;
					
					}
				}
			
				while(N!=-1);
				
				
				System.out.println("La suma de los numeros pares es: " + SP);
				System.out.println("El promedio de los numeros impares es: " + PI);
	}
}
