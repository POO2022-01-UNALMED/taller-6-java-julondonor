package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	public static int CantidadCamiones;
	public Camion(String placa, String nombre, double precio, double peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		Camion.CantidadCamiones++;
	}
	
	public int getEjes() {
		return this.ejes;
	}
	public void setPuestos(int ejes) {
		this.ejes = ejes;
	}
}
