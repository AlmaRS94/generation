package generation.proyecto2;

import java.text.DecimalFormat;

public class Factura {

	private String numero;
	private String descripcion;
	private int cantidadComprada;
	private double precioUnitario;

	public Factura(String numero, String descripcion, int cantidadComprada, double precioUnitario) {
		this.numero = numero;
		this.descripcion = descripcion;
		this.cantidadComprada = cantidadComprada;
		this.precioUnitario = precioUnitario;

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadComprada() {
		return cantidadComprada;
	}

	public void setCantidadComprada(int cantidadComprada) {
		this.cantidadComprada = cantidadComprada;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double getTotalFactura() {
		double total = precioUnitario * cantidadComprada;
		if (total > 0) {
			return (int) total ;
		} else {
			return total;
		}
	}
}
