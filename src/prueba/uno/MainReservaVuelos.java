package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner LectorString = new Scanner (System.in);
		Scanner LectorInt = new Scanner (System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = LectorString.nextLine();
		System.out.println("Ingrese apellido: ");
		String apellido = LectorString.nextLine();
		System.out.println("Ingrese edad: ");
		int edad = LectorInt.nextInt();
		System.out.println("Ingrese codigo: ");
		int codigo = LectorInt.nextInt();
		System.out.println("Que tipo de pasajero es: 1.Pasajero Membresia 2.Pasajero Descuento  ");
		int opcion = LectorInt.nextInt();
		
		String membresia = " ";
		String descuento = " ";
		
		if (opcion ==1) {
			System.out.println("Ingrese codigo de membresia: ");
			membresia = LectorString.nextLine();
			
		}else {
			System.out.println("Ingrese codigo de descuento: ");
			descuento = LectorString.nextLine();
			
			
		}
		
		PasajeroVip pasajerov1 = new PasajeroVip();
		pasajerov1.setApellido("Teran");
		pasajerov1.setNombre("Daniel");
		pasajerov1.setCodigoMembresia("4564545jg");
		pasajerov1.setEdad(25);
		
		PasajeroVip pasajerov2 = new PasajeroVip("Javier", "Cruz", "fgfahg1", 30);
		
		PasajeroEconomico pasajeroeconomico1 = new PasajeroEconomico("Edison", "Cayambe", "kjhdsf25", 24);
		PasajeroEconomico pasajeroeconomico2 = new PasajeroEconomico("Jhonny", "Ninabanda", "fgfgf25", 27);
		
		Pasajero [][] asientos = new Pasajero [4][5];
		asientos [0][0] = pasajerov1;
		asientos [0][1] = pasajerov2;
		asientos [0][2] = pasajeroeconomico1;
		asientos [3][2] = pasajeroeconomico2;
		
		
		
		System.out.println("Ingrese fila del asiento: ");
		int fila = LectorInt.nextInt();
		System.out.println("Ingrese columna del asiento: ");
		int columna = LectorInt.nextInt();
		
		System.out.println("Los datos del pasajero son: ");
		System.out.println(asientos[fila][columna]);
	}

}
