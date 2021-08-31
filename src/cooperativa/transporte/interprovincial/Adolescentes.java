package cooperativa.transporte.interprovincial;

public class Adolescentes extends Pasajeros {

	String nombre;
	String apellido;
	String deportePractica;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDeportePractica() {
		return deportePractica;
	}
	public void setDeportePractica(String deportePractica) {
		this.deportePractica = deportePractica;
	}
	@Override
	public String toString() {
		return "Adolescentes [nombre=" + nombre + "]";
	}

	
	
}

