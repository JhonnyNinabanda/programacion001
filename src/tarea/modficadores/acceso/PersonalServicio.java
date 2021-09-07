package tarea.modficadores.acceso;

public class PersonalServicio extends Persona {
	
	public void Contabilidad() {
	
	System.out.println("Nombre del Empleado: " + Nombre);		// Variable Nombre puedo usar en esta clase porque es PUBLIC
	System.out.println("Apellido del Empleado: " + Apellido); 	// Variable Apellido puedo usar en esta clase porque es PUBLIC
	System.out.println("Edad del Empleado: " + Edad); 		 	// Variable Edad no puedo usar en esta clase porque es PRIVATE
	System.out.println("Genero del Empleado: " + Genero); 		// Variable Edad no puedo usar en esta clase porque es PRIVATE
	
	System.out.println("Nro del Empleado: " + NroEmpleado); 	// Variable NroEmpleado puedo usar en esta clase porque es DEFAULT
																// esta en el mismo paquete
	
	Persona empleado1 = new Persona();
	
	empleado1.PagarSueldo(); 	// Metodo PagarSueldo si puedo utilizar en esta clase porque es PROTECTED
	empleado1.CuentaBancaria(); // Metodo CuentaBancaria no puedo uilizar en esta clase porque es PRIVATE
	empleado1.PuestoTrabajo();  // Metodo PuestoTrabajo puedo utilizar en esta clase porque es PUBLIC
	
	}
	
	
	
}