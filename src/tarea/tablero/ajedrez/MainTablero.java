package tarea.tablero.ajedrez;

import java.util.Arrays;

public class MainTablero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	PiezaRey reyb = new PiezaRey();
	reyb.setReyBlanca("REY BLANCA");
	PiezaRey reyn = new PiezaRey();
	reyn.setReyNegra("REY NEGRA");
		
	PiezaReina reinab = new PiezaReina();
	reinab.setReinaBlanca("REINA BLANCA");
	PiezaReina reinan = new PiezaReina();
	reinan.setReinaNegra("REINA NEGRA");


	PiezaTorre torreb1 = new PiezaTorre();
	torreb1.setTorreBlanca("TORRE BLANCA 1");
	PiezaTorre torreb2 = new PiezaTorre();
	torreb2.setTorreBlanca("TORRE BLANCA 2");
	PiezaTorre torren1 = new PiezaTorre();
	torren1.setTorreNegra("TORRE NEGRA 1");
	PiezaTorre torren2 = new PiezaTorre();
	torren2.setTorreNegra("TORRE NEGRA 2");
	
	PiezaAlfil alfilb1 = new PiezaAlfil();
	alfilb1.setAlfilBlanca("ALFIL BLANCA 1");
	PiezaAlfil alfilb2 = new PiezaAlfil();
	alfilb2.setAlfilBlanca("ALFIL BLANCA 2");
	PiezaAlfil alfiln1 = new PiezaAlfil();
	alfiln1.setAlfilNegra("ALFIL NEGRA 1");
	PiezaAlfil alfiln2 = new PiezaAlfil();
	alfiln2.setAlfilNegra("ALFIL NEGRA 2");
	
	
	PiezaCaballo caballob1 = new PiezaCaballo();
	caballob1.setCaballoBlanca("CABALLO BALNCA 1");
	PiezaCaballo caballob2 = new PiezaCaballo();
	caballob2.setCaballoBlanca("CABALLO BALNCA 2");
	PiezaCaballo caballon1 = new PiezaCaballo();
	caballon1.setCaballoNegra("CABALLO NEGRA 1");
	PiezaCaballo caballon2 = new PiezaCaballo();
	caballon2.setCaballoNegra("CABALLO NEGRA 2");
	
	PiezaPeon peonb1= new PiezaPeon();
	peonb1.setPeonBlanca("PEON BLANCA 1");
	PiezaPeon peonb2= new PiezaPeon();
	peonb2.setPeonBlanca("PEON BLANCA 2");
	PiezaPeon peonb3= new PiezaPeon();
	peonb3.setPeonBlanca("PEON BLANCA 3");
	PiezaPeon peonb4= new PiezaPeon();
	peonb4.setPeonBlanca("PEON BLANCA 4");
	PiezaPeon peonb5= new PiezaPeon();
	peonb5.setPeonBlanca("PEON BLANCA 5");
	PiezaPeon peonb6= new PiezaPeon();
	peonb6.setPeonBlanca("PEON BLANCA 6");
	PiezaPeon peonb7= new PiezaPeon();
	peonb7.setPeonBlanca("PEON BLANCA 7");
	PiezaPeon peonb8= new PiezaPeon();
	peonb8.setPeonBlanca("PEON BLANCA 8");
	
	PiezaPeon peonn1= new PiezaPeon();
	peonn1.setPeonNegra("PEON NEGRA 1");
	PiezaPeon peonn2= new PiezaPeon();
	peonn2.setPeonNegra("PEON NEGRA 2");
	PiezaPeon peonn3= new PiezaPeon();
	peonn3.setPeonNegra("PEON NEGRA 3");
	PiezaPeon peonn4= new PiezaPeon();
	peonn4.setPeonNegra("PEON NEGRA 4");
	PiezaPeon peonn5= new PiezaPeon();
	peonn5.setPeonNegra("PEON NEGRA 5");
	PiezaPeon peonn6= new PiezaPeon();
	peonn6.setPeonNegra("PEON NEGRA 6");
	PiezaPeon peonn7= new PiezaPeon();
	peonn7.setPeonNegra("PEON NEGRA 7");
	PiezaPeon peonn8= new PiezaPeon();
	peonn8.setPeonNegra("PEON NEGRA 8");

	
	Piezas piezaTablero [][] = new   Piezas[8][8];
	
	piezaTablero[0][0] = torreb1;
	piezaTablero[0][1] = caballob1;
	piezaTablero[0][2] = alfilb1;
	piezaTablero[0][3] = reinab;
	piezaTablero[0][4] = reyb;
	piezaTablero[0][5] = alfilb2;
	piezaTablero[0][6] = caballob2;
	piezaTablero[0][7] = torreb2;
	piezaTablero[1][0] = peonb1;
	piezaTablero[1][1] = peonb2;
	piezaTablero[1][2] = peonb3;
	piezaTablero[1][3] = peonb4;
	piezaTablero[1][4] = peonb5;
	piezaTablero[1][5] = peonb6;
	piezaTablero[1][6] = peonb7;
	piezaTablero[1][7] = peonb8;
	
	piezaTablero[6][0] = torren1;
	piezaTablero[6][1] = caballon1;
	piezaTablero[6][2] = alfiln1;
	piezaTablero[6][3] = reinan;
	piezaTablero[6][4] = reyn;
	piezaTablero[6][5] = alfiln1;
	piezaTablero[6][6] = caballon2;
	piezaTablero[6][7] = torren2;
	piezaTablero[7][0] = peonn1;
	piezaTablero[7][1] = peonn2;
	piezaTablero[7][2] = peonn3;
	piezaTablero[7][3] = peonn4;
	piezaTablero[7][4] = peonn5;
	piezaTablero[7][5] = peonn6;
	piezaTablero[7][6] = peonn7;
	piezaTablero[7][7] = peonn8;
	
	
	for(int fila =0; fila<8; fila++) {
	for(int columna =0; columna<8; columna++) {
		if (fila == columna) {
			piezaTablero [fila][columna]= reyb ;
		}else {
			piezaTablero [fila][columna]= reyb;
			} 
		
		System.out.print(piezaTablero[fila][columna] + " ");
			
		}
	System.out.println();
	
		}

	}
}

