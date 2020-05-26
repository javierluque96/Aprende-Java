package tiendaOnline;

public class Producto {
	
	private int codigo;
	private String nombre;
	private String imagen;
	private double precio;
	
	public Producto(int codigo, String nombre, String imagen, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.imagen = imagen;
		this.precio = precio;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public double getPrecio() {
		return precio;
	}

}
