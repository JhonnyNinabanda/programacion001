package bucles;

import java.util.Scanner;

public class Ejercicio2DoWhile {

	public static void main(String[] args) {

				// Crear un programa que solicite ingresar un n�mero (solo positivos), 
				// y as� seguir� solicitando ingresar un n�mero hasta que se ingrese el n�mero (-1),
				// cuando se ingrese el numero -1, ya no solicitar� m�s n�meros y en ese momento 
				// el programa debe imprimir la suma solo de los n�meros pares ingresados y 
				// el promedio solo de los n�meros impares ingresados hasta ese momento.
				
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
