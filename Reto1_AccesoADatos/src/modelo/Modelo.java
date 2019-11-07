package modelo;

public class Modelo {

	private Fichero fichero;
	private BBDD bbdd;
	private ConsultasBBDD consultas;
	private Empleado empleado;
	private Departamento departamento;
	private LeerFichero leerFichero;
	private Metodos metodos;
	
	public Modelo() {
		setFichero(new Fichero());
		setBbdd(new BBDD( ));
		setEmpleado(new Empleado());
		setConsultas(new ConsultasBBDD());
    setLeerFichero(new LeerFichero());
    setMetodos(new Metodos());

	}

	public Fichero getFichero() {
		return fichero;
	}

	public void setFichero(Fichero fichero) {
		this.fichero = fichero;
	}

	public BBDD getBbdd() {
		return bbdd;
	}

	public void setBbdd(BBDD bbdd) {
		this.bbdd = bbdd;
	}

	public ConsultasBBDD getConsultas() {
		return consultas;
	}

	public void setConsultas(ConsultasBBDD consultas) {
		this.consultas = consultas;
	}

	public LeerFichero getLeerFichero() {
		return leerFichero;
	}
	public  void setLeerFichero(LeerFichero leerFichero) {
		this.leerFichero = leerFichero;

		}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Metodos getMetodos() {
		return metodos;
	}

	public void setMetodos(Metodos metodos) {
		this.metodos = metodos;
	}
	
}
