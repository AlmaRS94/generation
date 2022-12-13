package generation.proyect1;

public class Propietario {
	
	private String nombre;
	private String rfc;
	private String curp;
	private String edad;
	private String fechaNacimiento;
	private String calle;
	private String colonia;
	private String ciudad;
	private String codigoPostal;
	
	public Propietario() {}

	public Propietario(String nombre, String rfc, String curp){ 
		this.nombre = nombre;
		this.rfc = rfc;
		this.curp = curp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getrfc() {
		return rfc;
	}

	public void setrfc(String rfc) {
		this.rfc = rfc;
	}

	public String getcurp() {
		return curp;
	}

	public void setcurp(String curp) {
		this.curp = curp;
	}

	public String getEdad() {
		return edad;
	}

	
	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
