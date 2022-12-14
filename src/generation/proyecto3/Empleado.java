package generation.proyecto3;

public class Empleado {

	private String nombre;
	private String apellido;
	private double salarioMensual;
	public static int numeroEmpleados;

	public Empleado(String nombre, String apellido, double salarioMensual) {
		numeroEmpleados += 1;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioMensual = salarioMensual;
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

	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

}
