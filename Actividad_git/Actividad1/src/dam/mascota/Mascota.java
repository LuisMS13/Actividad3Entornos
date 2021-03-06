package dam.mascota;

public class Mascota {
	private String id;
	private String nombre;
	private String color;
	
	public Mascota(String id, String nombre, String color) {
		this.id = id;
		this.nombre = nombre;
		this.color = color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "id: " + id + "\nnombre: " + nombre + "\ncolor: " + color;
	}
}
