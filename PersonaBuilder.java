package programacionFuncional1;


public class PersonaBuilder {
	
	private String nombre;
	private int edad;
	
	public PersonaBuilder() {
		
	}
	
	public PersonaBuilder nombre(String nombre) {
		this.nombre=nombre;
		return this;
		
	}
	public PersonaBuilder edad(int edad) {
		this.edad=edad;
		return this;
		
	}
	public Persona build() {
        return new Persona(this);
    }
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
