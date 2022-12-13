package generation.proyect1;

public class Automovil {

	private String modelo;
	private String color;
	private int anio;
	private String marca;
	private int chasis;
	private int velocidadMax;
	private int velocidadAct;
	private int numeroPuertas;
	private boolean techoSolar;
	private int numeroMarchas;
	private boolean transmisionAutomatica;
	public int marchaAct;

	public Automovil(String modelo, String color, int anio, String marca, int chasis, int velocidadMax,
			int velocidadAct, int numeroPuertas, boolean techoSolar, int numeroMarchas, boolean transmisionAutomatica) {
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.marca = marca;
		this.chasis = chasis;
		this.velocidadMax = velocidadMax;
		this.velocidadAct = velocidadAct;
		this.numeroPuertas = numeroPuertas;
		this.techoSolar = techoSolar;
		this.numeroMarchas = numeroMarchas;
		this.transmisionAutomatica = transmisionAutomatica;
		this.marchaAct = 0;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getChasis() {
		return chasis;
	}

	public void setChasis(int chasis) {
		this.chasis = chasis;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public int getVelocidadAct() {
		return velocidadAct;
	}

	public void setVelocidadAct(int velocidadAct) {
		this.velocidadAct = velocidadAct;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public boolean isTechoSolar() {
		return techoSolar;
	}

	public void setTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}

	public int getNumeroMarchas() {
		return numeroMarchas;
	}

	public void setNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}

	public boolean isTransmisionAutomatica() {
		return transmisionAutomatica;
	}

	public void setTransmisionAutomatica(boolean transmisionAutomatica) {
		this.transmisionAutomatica = transmisionAutomatica;
	}

	public void cambiarMarcha(){
		if (marchaAct < numeroMarchas) {
			marchaAct += 1;
		}
	}

	public void disminuirMarcha() {
		if(marchaAct >= -1 && velocidadAct > 0){
			marchaAct -= 1;
		}
	}
	public void acelerar() {
		if (velocidadAct < velocidadMax) {
			velocidadAct += 1;
		}
	}

	public void frenar() {
		velocidadAct = 0; 
	}

}
