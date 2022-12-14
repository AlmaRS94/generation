package generation.proyecto1;

public class Proyecto1 {

	public static void main(String args[]) {
		Direccion direccion1 = new Direccion("Manzana", "Agua Azul", "CDMX", "19/03/1994");
		Propietario persona1 = new Propietario("Alma", "ROSA190394JJJ", "ROSA190394MMNCFK56", direccion1);
		Marca marca1 = new Marca("x", "p", 2016, "z");
		Automovil auto1 = new Automovil("Cherokee Limited", "Black", 2017, 4, 200, 0, 5, false, 5, true, persona1,
				marca1);
		auto1.mostrarVolumenGasolina(5);
	}
}
