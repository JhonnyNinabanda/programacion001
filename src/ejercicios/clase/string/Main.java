package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. contains
		String frase = "Programacion de algoritmo módulo II";
		Scanner Lector = new Scanner (System.in);
		System.out.println("Ingrese el nombre del libro: ");
		String palabra = Lector.nextLine();
		
		boolean resultado = frase.contains(palabra);
		System.out.println("Contiene la palabra: " + resultado);
		
		//2. equals
		
		System.out.println(" ");
		System.out.println("************************************");
		
		String cadena1 = "jhonny";
		System.out.println("Ingrese la segunda cadena a comparar");
		String cadena2 = Lector.nextLine();
		
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales: " + resultado2);
		
		// 3 y 4 Upper Lower 
		
		System.out.println(" ");
		System.out.println("*****************************************");
		String nombre = "juanito";
		String nombreEnMayuscula =  nombre.toUpperCase();
		System.out.println("Nombre en Mayuscula: " + nombreEnMayuscula);
		
		String nombre2 = "JOSE";
		String nombreEnMinuscula = nombre.toLowerCase();
		System.out.println("Nombre en Minuscula: " + nombreEnMinuscula);
		
 	}
}
