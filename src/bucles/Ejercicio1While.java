package bucles;

import java.util.Scanner;

public class Ejercicio1While {

	public static void main(String[] args) {
		
				// Crear un programa que solicite ingresar un número (solo positivos),
				// y así seguirá solicitando ingresar un número hasta que se ingrese el número
				// cero (0),
				// cuando se ingrese el numero cero, ya no solicitará más números y en ese
				// momento el programa debe imprimir la suma y
				// el promedio de los números ingresados hasta ese momento. Adicional deberá
				// imprimir la cantidad de números ingresados por el usuario.

				Scanner Lector = new Scanner(System.in);

				System.out.println("Programa de la  Prueba 1");
				System.out.println("========================");
				System.out.println(" ");

				int N=0 ;
				int S = 0;
				float P = 0;
				int C = 0;
				
				System.out.print("Ingrese un numero positivo: ");
				N = Lector.nextInt();
				
				while (N != 0) {
				
					S = S+N;
					C = C+1;
					P = (float) S/C;
					
					System.out.print("Ingrese un numero positivo: ");
					N = Lector.nextInt();
				
					}

				System.out.println("La suma es: " + S);
				System.out.printf("El promedio es : %.2f " , P);
				System.out.println("\nCantidad de numeros ingresados es: " + C);

	}

}
