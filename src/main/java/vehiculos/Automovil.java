package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	public static int CantidadAutomoviles;
	public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		Automovil.CantidadAutomoviles++;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	
}
