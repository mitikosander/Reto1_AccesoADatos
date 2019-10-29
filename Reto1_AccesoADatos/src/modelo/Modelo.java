package modelo;

public class Modelo {

	private Fichero fichero;
	private BBDD bbdd;
	private ConsultasBase consultas;
	private LeerFichero leerFichero;
	public Modelo() {
		setFichero(new Fichero());
		setBbdd(new BBDD( ));
		setLeerFichero(new LeerFichero());
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

	public ConsultasBase getConsultas() {
		return consultas;
	}

	public void setConsultas(ConsultasBase consultas) {
		this.consultas = consultas;
	}

	public LeerFichero getLeerFichero() {
		return leerFichero;
	}

	public void setLeerFichero(LeerFichero leerFichero) {
		this.leerFichero = leerFichero;
	}
	
}
