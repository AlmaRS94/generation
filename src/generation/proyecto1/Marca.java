package generation.proyecto1;

public class Marca {
	
	private String nombre;
	private String numeroModelo;
	private int anioLanzamiento;
	private String codigoVerificador;
	
	public Marca(String nombre, String numeroModelo, int anioLanzamiento, String codigoVerificador) {
		this.nombre = nombre;
		this.numeroModelo = numeroModelo;
		this.anioLanzamiento = anioLanzamiento;
		this.codigoVerificador = codigoVerificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroModelo() {
		return numeroModelo;
	}

	public void setNumeroModelo(String numeroModelo) {
		this.numeroModelo = numeroModelo;
	}

	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}

	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	} 
	
	
	
}
