package vehiculos;
import java.util.*;


public class Pais {
	private String nombre;
	private static ArrayList<Pais> Paises = new ArrayList<Pais>();
	
	public Pais() {}
	public Pais(String nombre) {
		this.nombre = nombre;
		Pais.Paises.add(this);
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		Hashtable<String, Integer> freq = new Hashtable<String,Integer>();
		int maximo = 0;
		Pais ganador = new Pais();
		for(Pais pais: Pais.Paises) {
			String nombre= pais.getNombre();
			Integer cuantas = freq.get(nombre);
			freq.put(nombre, (cuantas == null) ? 1 : cuantas+1);
			
			if (((cuantas == null) ? 1 : cuantas+1) >maximo) {
				maximo = (cuantas == null) ? 1 : cuantas+1;
				ganador = pais;
			}
		}
		
		return ganador;
		}
		
}

