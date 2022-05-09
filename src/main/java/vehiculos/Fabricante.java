package vehiculos;
import java.util.ArrayList;
import java.util.Hashtable;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public static ArrayList<Fabricante> Fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante() {}
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre; this.pais = pais;
		Fabricante.Fabricantes.add(this);
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Hashtable<String, Integer> freq = new Hashtable<String,Integer>();
		int maximo = 0;
		Fabricante ganador = new Fabricante();
		for(Fabricante fabricante: Fabricante.Fabricantes) {
			String nombre= fabricante.getNombre();
			Integer cuantas = freq.get(nombre);
			freq.put(nombre, (cuantas == null) ? 1 : cuantas+1);
			
			if (((cuantas == null) ? 1 : cuantas+1) >maximo) {
				maximo = (cuantas == null) ? 1 : cuantas+1;
				ganador = fabricante;
			}
		}
		
		return ganador;
		}
}
