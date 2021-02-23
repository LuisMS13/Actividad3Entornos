package pojo.coche;

public class Coche {
	
	private String id;
	private String matriucla;
	private String modelo;
	private String marca;
	private int a�o_fabricacion;
	
	public Coche(String id, String matriucla, String modelo, String marca, int a�o_fabricacion) {
		super();
		this.id = id;
		this.matriucla = matriucla;
		this.modelo = modelo;
		this.marca = marca;
		this.a�o_fabricacion = a�o_fabricacion;
	}
	
	public int getA�o_fabricacion() {
		return a�o_fabricacion;
	}

	public void setA�o_fabricacion(int a�o_fabricacion) {
		this.a�o_fabricacion = a�o_fabricacion;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMatriucla() {
		return matriucla;
	}
	public void setMatriucla(String matriucla) {
		this.matriucla = matriucla;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
