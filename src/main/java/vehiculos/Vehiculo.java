package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private double precio;
	private double peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso, String traccion, Fabricante fabricante) {
		this.placa= placa; this.puertas=puertas; this.velocidadMaxima=velocidadMaxima;
		this.nombre = nombre; this.precio = precio; this.peso = peso;
		this.traccion = traccion; this.fabricante = fabricante;
		Vehiculo.CantidadVehiculos++;
	}
	
	//get y set
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return Vehiculo.CantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidad) {
		Vehiculo.CantidadVehiculos = cantidad;
	}
	
	public static String vehiculosPorTipo() {
		String s;
		s= "Automoviles: "+Automovil.CantidadAutomoviles+"\nCamionetas: "+Camioneta.CantidadCamionetas+"\nCamiones: "+Camion.CantidadCamiones;
		return s;
	}
	
}
