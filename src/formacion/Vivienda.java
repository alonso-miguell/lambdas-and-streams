package formacion;

import java.util.Optional;

public class Vivienda {

	private Optional<Persona> propietario;
	
	private String nombre;

	public Vivienda(Persona propietario, String nombre) {
		this.propietario=Optional.of(propietario);
		this.nombre = nombre;
	}
	
	public Vivienda(String nombre) {
		propietario=Optional.empty();
		this.nombre = nombre;
	}

	public Optional<Persona> getPropietario() {
		return propietario;
	}

	public String getNombre() {
		return nombre;
	}
	
	public Optional<String> nombrePropietario() {
		if(propietario.isPresent())
			return Optional.of(this.propietario.get().getNombre());

		return Optional.empty();
	}
	
	
}
