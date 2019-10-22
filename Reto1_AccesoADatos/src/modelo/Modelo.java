package modelo;

public class Modelo {

	private Fichero fichero;
	private BBDD bbdd;
	private ConsultasBase consultas;
	//Recogeremos el valor desde el fichero
	private String nombreBase;
	
	//recogeremos el valor desde el fichero
	private String url;
	
	public Modelo() {
		setFichero(new Fichero());
		setBbdd(new BBDD(url,nombreBase ));
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
	
}
