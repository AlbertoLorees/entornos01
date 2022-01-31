package holaMundo;

import java.util.Date;

public class Mensaje {
	private String emisor;
	private String cuerpo;
	private Date fechaHoraCreacion;
	private Date fechaHoraModificacion;
	
	
	public Mensaje() {
		emisor = "Emisor desconocido";
		cuerpo = "Texto desconocido";
	}

	public Mensaje(String emisor, String texto) {
		super();
		this.emisor = emisor;
		this.cuerpo = texto;
		this.fechaHoraCreacion = new Date();
		this.fechaHoraModificacion = new Date();
	}
	
	private void actualizarFechaHoraModificacion() {
		this.fechaHoraModificacion = new Date();
		System.out.println("Hora actualizada!");
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
		actualizarFechaHoraModificacion();
	}

	public String getTexto() {
		return cuerpo;
	}

	public void setTexto(String texto) {
		this.cuerpo = texto;
		actualizarFechaHoraModificacion();
	}

	@Override
	public String toString() {
		return "Mensaje de " + emisor  + ": " + cuerpo + "";
	}
	
	
	
	
	
	
	
	

}
