package tarea.modficadores.acceso;

public class PersonalAdministartivo extends Persona {
	
	public void Contabilidad() {
		
		System.out.println("Nombre del Empleado: " + Nombre);		// Variable Nombre puedo usar en esta clase porque es PUBLIC
		System.out.println("Apellido del Empleado: " + Apellido); 	// Variable Apellido puedo usar en esta clase porque es PUBLIC
		System.out.println("Nro del Empleado: " + NroEmpleado); 	// Variable NroEmpleado puedo usar en esta clase porque es DEFAULT
		System.out.println("Edad del Empleado: " + Edad); 		 	// Variable Edad no puedo usar en esta clase porque es PRIVATE
		
		Persona empleado = new Persona();
		
		empleado.PagarSueldo(); 	// Metodo PagarSueldo si puedo utilizar en esta clase porque es PROTECTED
		empleado.CuentaBancaria(); // Metodo CuentaBancaria no puedo uilizar en esta clase porque es PRIVATE
	}

}

