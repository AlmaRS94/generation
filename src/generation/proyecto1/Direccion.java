package generation.proyecto1;

public class Direccion {

	private String calle;
	private String colonia;
	private String ciudad;
	private String codigoPostal;
	
	public Direccion(String calle, String colonia, String ciudad, String codigoPostal){
		this.calle = calle;
		this.colonia = colonia;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
}
