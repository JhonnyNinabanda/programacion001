package prueba.uno;

public class PasajeroEconomico extends Pasajero {
	private String codigoDescuento;
	
	public PasajeroEconomico(String nombre, String apellido,String codigoDescuento, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigoDescuento = codigoDescuento;
		this.edad = edad;
	}
	// Metodos SET Y GET
	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}
	
	
}
