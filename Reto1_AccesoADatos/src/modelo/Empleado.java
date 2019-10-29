package modelo;

import java.sql.Date;

public class Empleado {
	private int codigo;
	private String nombre;
	private String apellido;
	private Date fecha_creacion;
	private int cod_dpto;
	private int cod_jefe;
	
	Empleado(){
		
	}

	public Empleado(int codigo, String nombre, String apellido, Date fecha_creacion, int cod_dpto, int cod_jefe) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_creacion = fecha_creacion;
		this.cod_dpto = cod_dpto;
		this.cod_jefe = cod_jefe;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public int getCod_dpto() {
		return cod_dpto;
	}

	public void setCod_dpto(int cod_dpto) {
		this.cod_dpto = cod_dpto;
	}

	public int getCod_jefe() {
		return cod_jefe;
	}

	public void setCod_jefe(int cod_jefe) {
		this.cod_jefe = cod_jefe;
	}
}
