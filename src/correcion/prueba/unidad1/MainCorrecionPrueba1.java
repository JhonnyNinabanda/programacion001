package correcion.prueba.unidad1;

import java.util.Scanner;

public class MainCorrecionPrueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				// Crear un programa que solicite ingresar un n�mero (solo positivos),
				// y as� seguir� solicitando ingresar un n�mero hasta que se ingrese el n�mero cero (0),
				// cuando se ingrese el numero cero, ya no solicitar� m�s n�meros y en ese momento el programa debe imprimir la suma y
				// el promedio de los n�meros ingresados hasta ese momento. Adicional deber� imprimir la cantidad de n�meros ingresados por el usuario.
				
				Scanner Lector = new Scanner(System.in);

				System.out.println("Programa de la  Prueba 1");
				System.out.println("========================");
				System.out.println(" ");

				int N;
				int S = 0;
				float P = 0;
				int C = 0;
				int i =0;
				
				for(i = 1; i != 0; i++ ) {
					
					System.out.print("Ingrese un numero positivo: ");
					N = Lector.nextInt();
					
					if(N==0) {
						i=-1;
					}else {
						
						S = S + N;
						P = S / i;
						C = C+1;
					}
				}
					System.out.println("La suma es: " +S);
					System.out.println("El promedio es : " + P);
					System.out.println("Cantidad de numeros ingresados es: " +C);
			
	}

}
