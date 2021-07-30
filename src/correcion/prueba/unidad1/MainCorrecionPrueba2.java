package correcion.prueba.unidad1;

import java.util.Scanner;

public class MainCorrecionPrueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// Crear un programa que solicite ingresar un número (solo positivos), 
				// y así seguirá solicitando ingresar un número hasta que se ingrese el número (-1),
				// cuando se ingrese el numero -1, ya no solicitará más números y en ese momento 
				// el programa debe imprimir la suma solo de los números pares ingresados y 
				// el promedio solo de los números impares ingresados hasta ese momento.
				
				Scanner Lector = new Scanner(System.in);
				
				System.out.println("Programa de la  Prueba 2");
				System.out.println("========================");
				System.out.println(" ");
				
				int N; 
				int SP = 0;
				int SI =0;
				int CI = 0;
				float PI = 0;
				int i =0;
			
				
				for (i=1; i!=-1; i++) {
					
					System.out.print("Ingrese un numero positivo: ");
					N = Lector.nextInt();
					
					if(N==-1) {
						i = -2;
					}else {
						
					if (N%2==0) {
						SP =SP+N;
					}else {
						SI = SI+N;
						CI = CI+1;
						PI = (float) SI/CI;
						
					}
				}
					
			}
				
				System.out.println("La suma de los numeros pares es: " + SP);
				System.out.println("El promedio de los numeros imapres es: " + PI);
		
	}

}
