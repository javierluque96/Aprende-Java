package tiendaOnline;

import java.util.ArrayList;

public class Carrito {
	ArrayList<ElementoCarrito> c;
	
	public Carrito() {
		c = new ArrayList<ElementoCarrito>();
	}
	
	public ArrayList<ElementoCarrito> getElementos() {
		return c;
	}
	
	public void añadeProducto(int codigo) {
		ElementoCarrito e = new ElementoCarrito(codigo);
		
		if (c.contains(e)) {
			int i = c.indexOf(e);
			
			c.get(i).setCantidad(c.get(i).getCantidad() + 1);
		} else {
			c.add(e);
		}
		
	}
	
	public void eliminaProducto(int codigo) {
		ElementoCarrito e = new ElementoCarrito(codigo);
		
		c.remove(c.indexOf(e));
	}
}
