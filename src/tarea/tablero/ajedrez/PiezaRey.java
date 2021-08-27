package tarea.tablero.ajedrez;

public class PiezaRey extends Piezas {
	
	private String reyBlanca;
	private String reyNegra;
	
	
	public String getReyBlanca() {
		return reyBlanca;
	}
	public void setReyBlanca(String reyBlanca) {
		this.reyBlanca = reyBlanca;
	}

	@Override
	public String toString() {
		return "PiezaRey [reyBlanca=" + reyBlanca + ", reyNegra=" + reyNegra + "]";
	}
	public String getReyNegra() {
		return reyNegra;
	}
	public void setReyNegra(String reyNegra) {
		this.reyNegra = reyNegra;
	}
	
}
