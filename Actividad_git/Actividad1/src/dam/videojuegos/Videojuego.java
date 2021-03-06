package dam.videojuegos;

public class Videojuego {
	
	private String id;
	private String nombre;
	private String compania;
	private int precio;
	
	public Videojuego(String id, String nombre, String compania, int precio) {
		this.id = id;
		this.nombre = nombre;
		this.compania = compania;
		this.precio = precio;
	}
	
	
	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	@Override
	public String toString() {
		return "id: " + id + "\nnombre: " + nombre + "\ncompania: " + compania;
	}
}
