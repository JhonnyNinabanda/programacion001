package diagramas.de.flujo;

import java.util.Scanner;

public class MainTGrupal {

	// Se ingresa por teclado 3 n�meros correspondientes a la fecha de nacimiento de
	// la persona,
	// el primer n�mero es el d�a, el segundo n�mero es el mes y el tercero n�mero
	// es el a�o de nacimiento,
	// de la misma manera se debe ingresar la fecha actual.
	// Se asume que las fechas ingresadas est�n correctas, es decir que son fechas
	// reales.
	// El programa debe calcular la edad de la persona. Ejemplo de la impresi�n
	// final del programa:
	// "Su edad es: 21 a�os, 3 meses, 15 d�as"//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Entrada = new Scanner(System.in);

		System.out.println("Calculo de la edad exacta");
		System.out.println("=========================");

		System.out.println(">> Ingrese fecha de nacimiento << ");
		int dianacimiento, mesnacimiento, a�onacimiento;
		System.out.print("Introduzca d�a nacimiento: ");
		dianacimiento = Entrada.nextInt();
		System.out.print("Introduzca mes nacimiento: ");
		mesnacimiento = Entrada.nextInt();
		System.out.print("Introduzca a�o nacimiento: ");
		a�onacimiento = Entrada.nextInt();

		if ((a�onacimiento % 4 == 0) && ((a�onacimiento % 100 != 0) || (a�onacimiento % 400 == 0))) // Nacio en un a�o
																									// bisiesto
			System.out.println("El a�o de nacimiento es Bisiesto");

		else if (mesnacimiento == 2 && (dianacimiento >= 1 && dianacimiento <= 29)) {
			System.out.println(dianacimiento + "/" + mesnacimiento + "/" + a�onacimiento + ": Mes tiene 29 dias");
		}

		else
			System.out.println("El a�o de nacimientono no es Bisiesto");

		if (a�onacimiento == 0) { // El �nico a�o que no existe es el 0
			System.out.println("Fecha incorrecta");
		} else if (mesnacimiento == 2 && (dianacimiento >= 1 && dianacimiento <= 28)) {
			System.out.println(
					dianacimiento + "/" + mesnacimiento + "/" + a�onacimiento + ": Fecha ingresada es correcta");
		} else if ((mesnacimiento == 4 || mesnacimiento == 6 || mesnacimiento == 9 || mesnacimiento == 11)
				&& (dianacimiento >= 1 && dianacimiento <= 30)) {
			System.out.println(
					dianacimiento + "/" + mesnacimiento + "/" + a�onacimiento + ": Fecha ingresada  es correcta");
		} else if ((mesnacimiento == 1 || mesnacimiento == 3 || mesnacimiento == 5 || mesnacimiento == 7
				|| mesnacimiento == 8 || mesnacimiento == 10 || mesnacimiento == 12)
				&& (dianacimiento >= 1 && dianacimiento <= 31)) {
			System.out.println(
					dianacimiento + "/" + mesnacimiento + "/" + a�onacimiento + ": Fecha ingresada es correcta");
		} else
			System.out.println("Fecha incorrecta");

		System.out.println(">> Ingrese fecha actual << ");
		int diaactual, mesactual, a�oactual;
		System.out.print("Introduzca d�a actual: ");
		diaactual = Entrada.nextInt();
		System.out.print("Introduzca mes actual: ");
		mesactual = Entrada.nextInt();
		System.out.print("Introduzca a�o actual: ");
		a�oactual = Entrada.nextInt();

		if ((a�oactual % 4 == 0) && ((a�oactual % 100 != 0) || (a�oactual % 400 == 0))) // A�o actual es un a�o bisiesto
			System.out.println("El a�o actual es Bisiesto");

		else if (mesactual == 2 && (diaactual >= 1 && diaactual <= 29)) {
			System.out.println(diaactual + "/" + mesactual + "/" + a�oactual + ": Mes tiene 29 dias");
		} else
			System.out.println("El a�o actual no es Bisiesto");

		if (a�onacimiento == 0 || a�oactual == 0) {
			System.out.println("Fecha incorrecta");
		}

		else if (mesactual == 2 && (diaactual >= 1 && diaactual <= 28)) {
			System.out.println(diaactual + "/" + mesactual + "/" + a�oactual + ": Fecha ingresada es correcta");
		} else if ((mesactual == 4 || mesactual == 6 || mesactual == 9 || mesactual == 11)
				&& (diaactual >= 1 && diaactual <= 30)) {
			System.out.println(diaactual + "/" + mesactual + "/" + a�oactual + ": Fecha ingresada es correcta");
		} else if ((mesactual == 1 || mesactual == 3 || mesactual == 5 || mesactual == 7 || mesactual == 8
				|| mesactual == 10 || mesactual == 12) && (diaactual >= 1 && diaactual <= 31)) {
			System.out.println(diaactual + "/" + mesactual + "/" + a�oactual + ": Fecha ingresada correcta");
		} else
			System.out.println("Fecha incorrecta"); 
	
		int A = 0;
		int M = 0;
		int D = 0;
		int DMA = 0;
	

		 A = a�oactual - a�onacimiento; 
		 if(a�oactual==a�onacimiento) {
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

		 }if ((DMA == 2 ) && a�oactual % 4 == 0) { 				// CUANDOP EL A�O ES BISIESTO
		 DMN = 29;
		 
		 } else if (DMA == 2 ) {                                 // CUANDO EL A�O NO ES BISIESTO
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
		 
		System.out.println("A�O:" + A);
		System.out.println("MES:" + M);
		System.out.println("DIAS:" + D);

		System.out.println("Su edad es: " + A + " a�os, " + M + " meses, " + D + " dias.");

	}

}
