package modelo;

public class departamento {
	private int codigo;
	private String nombre;
	private String loc;
	
	
	departamento(){
		
	}
	
	public departamento(int codigo, String nombre, String loc) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.loc = loc;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
