package tarea.tablero.ajedrez;

import java.util.Arrays;

public class MainTablero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	PiezaRey rey = new PiezaRey();
	rey.setReyBlanca("R B");
	rey.setReyNegra("REY N");
		
	PiezaReina reina = new PiezaReina();
	reina.setReinaBlanca("REINA BLANCA");
	reina.setReinaNegra("REINA NEGRA");


	PiezaTorre torre = new PiezaTorre();
	torre.setTorreBlanca("TORRE BLANCA 1");
	torre.setTorreBlanca("TORRE BLANCA 2");
	torre.setTorreNegra("TORRE NEGRA 1");
	torre.setTorreNegra("TORRE NEGRA 2");
	
	PiezaAlfil alfil = new PiezaAlfil();
	alfil.setAlfilBlanca("ALFIL BLANCA 1");
	alfil.setAlfilBlanca("ALFIL BLANCA 2");
	alfil.setAlfilNegra("ALFIL NEGRA 1");
	alfil.setAlfilNegra("ALFIL NEGRA 2");
	
	PiezaCaballo caballo = new PiezaCaballo();
	caballo.setCaballoBlanca("CABALLO BALNCA 1");
	caballo.setCaballoBlanca("CABALLO BALNCA 2");
	caballo.setCaballoNegra("CABALLO NEGRA 1");
	caballo.setCaballoNegra("CABALLO NEGRA 2");
	
	PiezaPeon peon= new PiezaPeon();
	peon.setPeonBlanca("PEON BLANCA 1");
	peon.setPeonBlanca("PEON BLANCA 2");
	peon.setPeonBlanca("PEON BLANCA 3");
	peon.setPeonBlanca("PEON BLANCA 4");
	peon.setPeonBlanca("PEON BLANCA 5");
	peon.setPeonBlanca("PEON BLANCA 6");
	peon.setPeonBlanca("PEON BLANCA 7");
	peon.setPeonBlanca("PEON BLANCA 8");
	peon.setPeonNegra("PEON NEGRA 1");
	peon.setPeonNegra("PEON NEGRA 2");
	peon.setPeonNegra("PEON NEGRA 3");
	peon.setPeonNegra("PEON NEGRA 4");
	peon.setPeonNegra("PEON NEGRA 5");
	peon.setPeonNegra("PEON NEGRA 6");
	peon.setPeonNegra("PEON NEGRA 7");
	peon.setPeonNegra("PEON NEGRA 8");
	
	Piezas piezaTablero [][] = new   Piezas[8][8];
	
	piezaTablero[0][0] = torre;
	piezaTablero[0][1] = caballo;
	piezaTablero[0][2] = alfil;
	piezaTablero[0][3] = reina;
	piezaTablero[0][4] = rey;
	piezaTablero[0][5] = alfil;
	piezaTablero[0][6] = caballo;
	piezaTablero[0][7] = torre;
	piezaTablero[1][0] = peon;
	piezaTablero[1][1] = peon;
	piezaTablero[1][2] = peon;
	piezaTablero[1][3] = peon;
	piezaTablero[1][4] = peon;
	piezaTablero[1][5] = peon;
	piezaTablero[1][6] = peon;
	piezaTablero[1][7] = peon;
	
	piezaTablero[6][0] = torre;
	piezaTablero[6][1] = caballo;
	piezaTablero[6][2] = alfil;
	piezaTablero[6][3] = reina;
	piezaTablero[6][4] = rey;
	piezaTablero[6][5] = alfil;
	piezaTablero[6][6] = caballo;
	piezaTablero[6][7] = torre;
	piezaTablero[7][0] = peon;
	piezaTablero[7][1] = peon;
	piezaTablero[7][2] = peon;
	piezaTablero[7][3] = peon;
	piezaTablero[7][4] = peon;
	piezaTablero[7][5] = peon;
	piezaTablero[7][6] = peon;
	piezaTablero[7][7] = peon;
	
	
	for(int fila =0; fila<8; fila++) {
	for(int columna =0; columna<8; columna++) {
		if (fila == columna) {
			piezaTablero [fila][columna]= rey ;
		}else {
			piezaTablero [fila][columna]= reina;
			} 
		
		System.out.print(piezaTablero[fila][columna] + " ");
			
		}
	System.out.println();
	
	};

}
}

