package tiendaOnline;

public class ElementoCarrito {
	
	private Catalogo c = new Catalogo();
	private Producto p;
	private int cantidad;
	
	
	public ElementoCarrito(int codigo) {		
		for (Producto pro : c.getProductos()) {
			if (pro.getCodigo() == codigo) {
				p = pro;
			}
		}
		
		this.cantidad = 1;
	}
	
	public Producto getProducto() {
		return p;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.p.getCodigo() == ((ElementoCarrito)obj).getProducto().getCodigo();
	}
}
