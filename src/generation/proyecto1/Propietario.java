package generation.proyecto1;

public class Propietario {
	
	private String nombre;
	private String rfc;
	private String curp;
	private String edad;
	private Direccion direccion; 
	private String fechaNacimiento;

	public Propietario(String nombre, String rfc, String curp, Direccion direccion){ 
		this.nombre = nombre;
		this.rfc = rfc;
		this.curp = curp;
		this.direccion = direccion;
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	

}
