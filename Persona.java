package programacionFuncional1;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(PersonaBuilder persona) {
		
		 
	     this.nombre = persona.getNombre();
	     this.edad = persona.getEdad();
	     
	}
	
	private Persona() {
		
		
	}
	
	
	
	

}
