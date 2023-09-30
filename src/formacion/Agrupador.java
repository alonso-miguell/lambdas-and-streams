package formacion;

import java.util.List;

public interface Agrupador {

	void add (Object elemento);
	
	int numeroElementos();

	default void addAll(List<Object> lista){
		lista.forEach( e -> add(e));
	}
	
}
