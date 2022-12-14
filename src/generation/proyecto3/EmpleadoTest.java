package generation.proyecto3;

public class EmpleadoTest {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado("Juan", "Perez", 1500);
		Empleado emp2 = new Empleado("Juana", "Perez", 2000);
		System.out.println(emp1.getSalarioMensual());
		System.out.println(emp2.getSalarioMensual());
		emp1.setSalarioMensual(emp1.getSalarioMensual() * 1.1);
		emp2.setSalarioMensual(emp2.getSalarioMensual() * 1.1);
		System.out.println(emp1.getSalarioMensual());
		System.out.println(emp2.getSalarioMensual());
		System.out.println("Numero de Empleados: " + Empleado.numeroEmpleados);
	}

}
