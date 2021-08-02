package diagramas.de.flujo;

import java.util.Scanner;

public class MainTGrupal {

	// Se ingresa por teclado 3 números correspondientes a la fecha de nacimiento de
	// la persona,
	// el primer número es el día, el segundo número es el mes y el tercero número
	// es el año de nacimiento,
	// de la misma manera se debe ingresar la fecha actual.
	// Se asume que las fechas ingresadas están correctas, es decir que son fechas
	// reales.
	// El programa debe calcular la edad de la persona. Ejemplo de la impresión
	// final del programa:
	// "Su edad es: 21 años, 3 meses, 15 días"//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Entrada = new Scanner(System.in);

		System.out.println("Calculo de la edad exacta");
		System.out.println("=========================");

		System.out.println(">> Ingrese fecha de nacimiento << ");
		int dianacimiento, mesnacimiento, añonacimiento;
		System.out.print("Introduzca día nacimiento: ");
		dianacimiento = Entrada.nextInt();
		System.out.print("Introduzca mes nacimiento: ");
		mesnacimiento = Entrada.nextInt();
		System.out.print("Introduzca año nacimiento: ");
		añonacimiento = Entrada.nextInt();

		if ((añonacimiento % 4 == 0) && ((añonacimiento % 100 != 0) || (añonacimiento % 400 == 0))) // Nacio en un año
																									// bisiesto
			System.out.println("El año de nacimiento es Bisiesto");

		else if (mesnacimiento == 2 && (dianacimiento >= 1 && dianacimiento <= 29)) {
			System.out.println(dianacimiento + "/" + mesnacimiento + "/" + añonacimiento + ": Mes tiene 29 dias");
		}

		else
			System.out.println("El año de nacimientono no es Bisiesto");

		if (añonacimiento == 0) { // El único año que no existe es el 0
			System.out.println("Fecha incorrecta");
		} else if (mesnacimiento == 2 && (dianacimiento >= 1 && dianacimiento <= 28)) {
			System.out.println(
					dianacimiento + "/" + mesnacimiento + "/" + añonacimiento + ": Fecha ingresada es correcta");
		} else if ((mesnacimiento == 4 || mesnacimiento == 6 || mesnacimiento == 9 || mesnacimiento == 11)
				&& (dianacimiento >= 1 && dianacimiento <= 30)) {
			System.out.println(
					dianacimiento + "/" + mesnacimiento + "/" + añonacimiento + ": Fecha ingresada  es correcta");
		} else if ((mesnacimiento == 1 || mesnacimiento == 3 || mesnacimiento == 5 || mesnacimiento == 7
				|| mesnacimiento == 8 || mesnacimiento == 10 || mesnacimiento == 12)
				&& (dianacimiento >= 1 && dianacimiento <= 31)) {
			System.out.println(
					dianacimiento + "/" + mesnacimiento + "/" + añonacimiento + ": Fecha ingresada es correcta");
		} else
			System.out.println("Fecha incorrecta");

		System.out.println(">> Ingrese fecha actual << ");
		int diaactual, mesactual, añoactual;
		System.out.print("Introduzca día actual: ");
		diaactual = Entrada.nextInt();
		System.out.print("Introduzca mes actual: ");
		mesactual = Entrada.nextInt();
		System.out.print("Introduzca año actual: ");
		añoactual = Entrada.nextInt();

		if ((añoactual % 4 == 0) && ((añoactual % 100 != 0) || (añoactual % 400 == 0))) // Año actual es un año bisiesto
			System.out.println("El año actual es Bisiesto");

		else if (mesactual == 2 && (diaactual >= 1 && diaactual <= 29)) {
			System.out.println(diaactual + "/" + mesactual + "/" + añoactual + ": Mes tiene 29 dias");
		} else
			System.out.println("El año actual no es Bisiesto");

		if (añonacimiento == 0 || añoactual == 0) {
			System.out.println("Fecha incorrecta");
		}

		else if (mesactual == 2 && (diaactual >= 1 && diaactual <= 28)) {
			System.out.println(diaactual + "/" + mesactual + "/" + añoactual + ": Fecha ingresada es correcta");
		} else if ((mesactual == 4 || mesactual == 6 || mesactual == 9 || mesactual == 11)
				&& (diaactual >= 1 && diaactual <= 30)) {
			System.out.println(diaactual + "/" + mesactual + "/" + añoactual + ": Fecha ingresada es correcta");
		} else if ((mesactual == 1 || mesactual == 3 || mesactual == 5 || mesactual == 7 || mesactual == 8
				|| mesactual == 10 || mesactual == 12) && (diaactual >= 1 && diaactual <= 31)) {
			System.out.println(diaactual + "/" + mesactual + "/" + añoactual + ": Fecha ingresada correcta");
		} else
			System.out.println("Fecha incorrecta"); 
	
		int A = 0;
		int M = 0;
		int D = 0;
		int DMA = 0;
	

		 A = añoactual - añonacimiento; 
		 if(añoactual==añonacimiento) {
		 A=A;
		 }if (mesnacimiento > mesactual) { 
		 A = A - 1;
		 }else if (mesnacimiento == mesactual) {
		 if (dianacimiento > diaactual) {
		 A = A - 1;
		 } else {
		 A = A;    
		 }
		 }

		 int DMN=0;

		 DMA=(mesactual-1); 
      
		 if ((DMA == 1 || DMA == 3 || DMA == 5 || DMA == 7 || DMA == 8 || DMA == 10 || DMA == 0)){
		 DMN = 31;
		 
		 }else if ((DMA == 4 || DMA == 6 || DMA == 9 || DMA == 11)) { 
		 DMN = 30;

		 }if ((DMA == 2 ) && añoactual % 4 == 0) { 				// CUANDOP EL AÑO ES BISIESTO
		 DMN = 29;
		 
		 } else if (DMA == 2 ) {                                 // CUANDO EL AÑO NO ES BISIESTO
		 DMN = 28;

		 }

		 M=mesnacimiento-mesactual;

		 if(mesnacimiento>mesactual) { 
		 if(dianacimiento>diaactual) {  
		 M=11-M; 
		 }else if(diaactual>dianacimiento){
		 M=12-M; 
		 }
		 }else if(mesactual>mesnacimiento){
		 if(dianacimiento>diaactual) { 
		 M=(mesactual-mesnacimiento)-1;
		 }else if(diaactual>dianacimiento){
		 M=mesactual-mesnacimiento;
		 D=diaactual-dianacimiento;
		 }
		 }else if (mesnacimiento==mesactual) {
		 M=0;
		 if(dianacimiento>diaactual) {
		 M=11-M;
		 }else if(diaactual>dianacimiento){ 
		 M=M;
		 }

		 }
		 if(dianacimiento>diaactual) {
		 D=DMN+diaactual-dianacimiento;

		 }else if(dianacimiento<=diaactual) {
		 D=diaactual-dianacimiento;
		 }
		 
		System.out.println("AÑO:" + A);
		System.out.println("MES:" + M);
		System.out.println("DIAS:" + D);

		System.out.println("Su edad es: " + A + " años, " + M + " meses, " + D + " dias.");

	}

}
