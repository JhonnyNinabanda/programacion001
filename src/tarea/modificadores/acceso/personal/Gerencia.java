package tarea.modificadores.acceso.personal;

import tarea.modficadores.acceso.Persona;

public class Gerencia extends Persona {

	public void ControlPersonal () {
		
		Persona empleado = new Persona ();
		
		System.out.println("Nombre del Empleado: " + Nombre);		// Variable Nombre puedo usar en esta clase porque es PUBLIC
		System.out.println("Apellido del Empleado: " + Apellido); 	// Variable Apellido puedo usar en esta clase porque es PUBLIC
		System.out.println("Edad del empleado: " + Edad);  			// La variabled Edad de la Clase Persona no se puede utilizar en esta clase porque es PRIVATE
		
		System.out.println("Nro de Empleado: " + NroEmpleado);      // La variable NroEmpleado es DEFAULT y nose puede utizar en esta clase
																	// porque esta en otro paquete
	
		empleado.PagarSueldo(); 	// Metodo PagarSueldo de la clase Persona si puedo utilizar en esta clase porque es PROTECTED
		empleado.CuentaBancaria(); 	// Metodo CuentaBancaria de la clase Persona no puedo uilizar en esta clase porque es PRIVATE
		empleado.PuestoTrabajo();  // Metodo PuestoTrabajo de la clase Persona puedo utilizar en esta clase porque es PUBLIC
		
	}
}

