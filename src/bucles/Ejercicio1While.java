package bucles;

import java.util.Scanner;

public class Ejercicio1While {

	public static void main(String[] args) {
		
				// Crear un programa que solicite ingresar un n�mero (solo positivos),
				// y as� seguir� solicitando ingresar un n�mero hasta que se ingrese el n�mero
				// cero (0),
				// cuando se ingrese el numero cero, ya no solicitar� m�s n�meros y en ese
				// momento el programa debe imprimir la suma y
				// el promedio de los n�meros ingresados hasta ese momento. Adicional deber�
				// imprimir la cantidad de n�meros ingresados por el usuario.

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
