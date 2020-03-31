package tiendaOnline;
import java.util.ArrayList;

public class Catalogo {
	
	private ArrayList<Producto> c;
	
	public Catalogo() {
		c = new ArrayList<Producto>();
		c.add(new Producto(0, "Pelikan Souvëran M-1000", "pelikan", 545));
		c.add(new Producto(1, "Parker Duofold International", "parkerduo", 406));
		c.add(new Producto(2, "Visconti Van Gogh", "visconti", 180));
		c.add(new Producto(3, "Waterman Expert", "waterman", 103.55));
		c.add(new Producto(4, "Delta Dolce Vita", "deltadolce", 480));
		c.add(new Producto(5, "Montblanc Meisterstück 146", "montblanc", 580));
		c.add(new Producto(6, "Montegrappa Extra 1930", "montegrappa", 545));
	}
	
	public ArrayList<Producto> getProductos() {
		return c;
	}
	
	public Producto getProducto(int codigo) {
		return c.get(codigo);
	}
}
