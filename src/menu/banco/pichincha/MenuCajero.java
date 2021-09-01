package menu.banco.pichincha;

import java.util.Scanner;

public class MenuCajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Lector = new Scanner(System.in);
		
		System.out.println("Bienvenidos >>Banco Pichincha<<");
		System.out.println("");
		
		int opcion=0;
		
		do {
			
			System.out.println("Banco Pichincha selecione una opcion: ");
			System.out.println("1. Retirar dinero");
			System.out.println("2. Cambiar de clave");
			System.out.println("3. Bloquear cuenta");
			System.out.println("4. Salir");
			
			opcion = Lector.nextInt();
			
			if (opcion == 1) {
				System.out.println("Ingrese valor a retirar: ");
				int N = Lector.nextInt();
			}else if(opcion == 2) {
				System.out.println("Ingrese una nueva clave: ");
				int P = Lector.nextInt();
				System.out.println("Su clave ha sido cambiada");
			}else if(opcion == 3) {
				System.out.println("Su cuenta ha sido bloqueada");
			}
			
			
		}while(opcion !=4);
	
	}

}
