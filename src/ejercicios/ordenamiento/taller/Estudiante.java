package ejercicios.ordenamiento.taller;

public class Estudiante implements Comparable<Estudiante> {
	
	private String nombre;
	private String apellido;
	private int numeroLista;
	private int edad;
	
	// Metodos Set y Get
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroLista() {
		return numeroLista;
	}
	
	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}

	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Estudiante o) {
	
		// 3 posibles retornos
		// 0
		// -1
		// 1
		if(this.edad > o.getEdad()) {
			return 1;
		}else if(this.edad == o.getEdad()) {
			return 0;
		}else {
			return -1;
		}
		
		}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", numeroLista=" + numeroLista + ", edad="
				+ edad + "]";
	}

}

