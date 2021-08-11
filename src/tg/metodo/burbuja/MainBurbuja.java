package tg.metodo.burbuja;

import java.util.Arrays;
import java.util.Scanner;

public class MainBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("METODO BURBUJA");
		System.out.println("==============");
		
		Scanner Lector = new Scanner(System.in);
		
		int elementos;
		int aux;
		
		System.out.print("Ingrese la longuitud del vector: ");
		elementos = Lector.nextInt();
		
		int VectorX [] = new int [elementos]; // Asignamos la longuitud del arreglo o vector
		
		for (int i=0; i<elementos; i++) {
			System.out.print("Ingrese valor de la posicion " +i+  " : " ); 
			int N = Lector.nextInt();
			
			VectorX[i]=N;					// Ingresamos los datos de la posicion
		}
		
		// Impresion del Arreglo 
				System.out.println("\nORDENAMIENTO EN JAVA");
				System.out.println("\nEl Vector antes de Ordenar: " + Arrays.toString(VectorX));
				
		// Impresion del arreglo ordenado
				Arrays.sort(VectorX);
				System.out.println("\nEl vector despues de ordenar: " + Arrays.toString(VectorX));
				
		
		// Metodo Burbuja
		
		for (int i=0; i<elementos; i++ ) {
			for(int j=0; j<elementos-1; j++) {       // Algoritmo
				if (VectorX[j] > VectorX[j+1] ) {    // Si numeroActual > numeroSiguiente cambio de posicion
					aux = VectorX[j];
					VectorX[j] = VectorX[j+1];
					VectorX[j+1] = aux;
				
				}
			}
		}
		
		// Impresion del arreglo ordenado en forma ascendente 
		
		System.out.println("\nArreglo ordenado en forma ascendente: ");
		for (int i=0; i<elementos; i++) {
			System.out.print(VectorX[i] + "  ");
			
		}
		// Impresion del arreglo ordenado en forma decendente
		
				System.out.println("\nArreglo ordenado en forma decendente: ");
				for (int i=elementos-1; i>=0; i--) {
					System.out.print(VectorX[i] + "  ");
					
		}		
	}
}
