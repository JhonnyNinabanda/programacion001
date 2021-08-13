package t01_programacionoo;

public class Propietario {
	
	/* Encapsulacion */
	
	private String Nombre;
	private float CI;
	private int NroTelefono;
	
	
	/* Abstraccion */
	
	void Pagar (String Cajero) {
		int Efectivo;
		int Tarjeta;
		String Valor = 20 + Cajero;
		
	}
	
	/* Polimorfismo */
	
	void Pagar (String Comprobante, String Ficha) {
		
		int Recibo = 0;
		int Voucher = 1;
		
	}
}
