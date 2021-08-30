package diagramas.de.flujo;

import java.util.Scanner;

public class MainFigura1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese el numero de filas: ");
		Scanner Lector = new Scanner(System.in);
		int n = Lector.nextInt();

		for (int fila = 1; fila <= n; fila++) {
			for (int ast = n; ast >= fila; ast--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
