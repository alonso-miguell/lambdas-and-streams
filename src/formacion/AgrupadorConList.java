package formacion;

import java.util.ArrayList;
import java.util.List;

public class AgrupadorConList implements Agrupador {

	private List<Object> contenido = new ArrayList<>();

	// Implementamos los metodos de la interface utilizando la lista contenido

	@Override
	public void add(Object elemento) {
		contenido.add(elemento);
	}

	@Override
	public int numeroElementos() {
		return contenido.size();
	}



}
