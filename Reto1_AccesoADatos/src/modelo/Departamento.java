package modelo;



public class Departamento {
	private int codigo;
	private String nombre;
	private String loc;
	
	
	Departamento(){
		
	}
	
	
	public Departamento(int codigo, String nombre, String loc) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.loc = loc;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int cod) {
		this.codigo = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
}
