package generation.proyect1;

public class Auto extends Automovil{

	public Auto(String modelo, String color, int anio, String marca, int chasis, int velocidadMax, int velocidadAct,
			int numeroPuertas, boolean techoSolar, int numeroMarchas, boolean transmisionAutomatica) {
		super(modelo, color, anio, marca, chasis, velocidadMax, velocidadAct, numeroPuertas, techoSolar, numeroMarchas,
				transmisionAutomatica);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		
		Automovil auto1 = new Automovil("Cherokee Limited", "Black", 2017, "Jeep", 4, 200, 0, 5, false, 5, true);
		System.out.println(auto1.marchaAct);
		auto1.cambiarMarcha();
		auto1.cambiarMarcha();
		auto1.cambiarMarcha();
		auto1.cambiarMarcha();
		System.out.println(auto1.marchaAct);
		auto1.cambiarMarcha();
		auto1.cambiarMarcha();
		System.out.println(auto1.marchaAct);
		auto1.disminuirMarcha();
		auto1.disminuirMarcha();
		auto1.disminuirMarcha();
		auto1.disminuirMarcha();
		auto1.disminuirMarcha();
		System.out.println(auto1.marchaAct);
		auto1.disminuirMarcha();
		System.out.println(auto1.marchaAct);
		
		
		
		
		
	}
	
}
