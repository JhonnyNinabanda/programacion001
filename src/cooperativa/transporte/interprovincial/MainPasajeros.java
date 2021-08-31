package cooperativa.transporte.interprovincial;

import java.util.Scanner;

import tarea.tablero.ajedrez.Piezas;

public class MainPasajeros  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adultos pas1 = new Adultos();
		pas1.setNombre("Juanito");
		Adultos pas2 = new Adultos();
		pas2.setNombre("LOrena");
		Adultos pas3 = new Adultos();
		pas3.setNombre("Marco");
		Adultos pas4 = new Adultos();
		pas4.setNombre("Pedro");
		Adultos pas5 = new Adultos();
		pas5.setNombre("Luis");
		Adultos pas6 = new Adultos();
		pas6.setNombre("Pablo");
		Adultos pas7 = new Adultos();
		pas7.setNombre("Diana");
		Adultos pas8 = new Adultos();
		pas8.setNombre("Scarlet");
		Adultos pas9 = new Adultos();
		pas9.setNombre("Diana");
		Adultos pas10 = new Adultos();
		pas10.setNombre("Dainelis");
		
		Adolescentes pas11 = new Adolescentes();
		pas11.setNombre("Camila");
		Adolescentes pas12 = new Adolescentes();
		pas11.setNombre("Paola");
		Adolescentes pas13 = new Adolescentes();
		pas11.setNombre("Karina");
		Adolescentes pas14 = new Adolescentes();
		pas11.setNombre("Estefania");
		Adolescentes pas15 = new Adolescentes();
		pas11.setNombre("Ermet");
		Adolescentes pas16 = new Adolescentes();
		pas11.setNombre("Segundo");
		Adolescentes pas17 = new Adolescentes();
		pas11.setNombre("Carlos");
		Adolescentes pas18 = new Adolescentes();
		pas11.setNombre("Hernan");
		Adolescentes pas19 = new Adolescentes();
		pas11.setNombre("Byron");
		Adolescentes pas20 = new Adolescentes();
		pas11.setNombre("Jessica");
		
		
		Pasajeros asientos [][] = new   Pasajeros [4][5];
		
		asientos[0][0] = pas1;
		asientos[0][1] = pas2;
		asientos[0][2] = pas3;
		asientos[0][3] = pas4;
		asientos[0][4] = pas5;
		asientos[3][0] = pas6;
		asientos[3][1] = pas7;
		asientos[3][2] = pas8;
		asientos[3][3] = pas9;
		asientos[3][4] = pas10;
		asientos[1][1] = pas11;
		asientos[1][2] = pas12;
		asientos[1][3] = pas13;
		asientos[1][4] = pas14;
		asientos[2][0] = pas15;
		asientos[2][1] = pas16;
		asientos[2][2] = pas17;
		asientos[2][3] = pas18;
		asientos[2][4] = pas19;
		
		int fila;
		int columna;
		
		System.out.println("Ingrese posicion del asiento: ");
		
		Scanner Lector = new Scanner(System.in);
		
		asientos[fila][columna];
		
		
	}

}
