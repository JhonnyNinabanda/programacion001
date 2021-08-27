package tarea.tablero.ajedrez;

public class PiezaReina extends Piezas {
	
	@Override
	public String toString() {
		return "PiezaReina [reinaBlanca=" + reinaBlanca + ", reinaNegra=" + reinaNegra + "]";
	}
	private String reinaBlanca;
	private String reinaNegra;
	
	public String getReinaBlanca() {
		return reinaBlanca;
	}
	public void setReinaBlanca(String reinaBlanca) {
		this.reinaBlanca = reinaBlanca;
	}
	
	public String getReinaNegra() {
		return reinaNegra;
	}
	public void setReinaNegra(String reinaNegra) {
		this.reinaNegra = reinaNegra;
	}
	

}
