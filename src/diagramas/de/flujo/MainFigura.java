package diagramas.de.flujo;

import java.util.Scanner;

public class MainFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Taller De Github
		//Exelente Trabajo

		System.out.print("Ingrese el numero de filas: ");
		Scanner Lector = new Scanner(System.in);
		int n = Lector.nextInt();

		for (int fila = 1; fila <= n; fila++) {
			for (int ast = 1; ast <= fila; ast++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
