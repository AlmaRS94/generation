package generation.proyecto4;

import java.util.Arrays;

public class IntegerSet {
	private boolean[] conjunto;
	public final static int TAMANIO_CONJUNTO = 100;
	
	public IntegerSet() {
		conjunto = new boolean[TAMANIO_CONJUNTO + 1];
	}

	public boolean[] union(boolean[] other) {
		if (other.length != conjunto.length) {
			return null;
		} 
		boolean[] resultado = new boolean[conjunto.length];
		for(int index = 0; index < conjunto.length; index++) {
			resultado[index] = other[index] || conjunto[index];
		}
		return resultado;
	}
	
	public boolean[] interseccion(boolean[] other) {
		if (other.length != conjunto.length) {
			return null;
		} 
		boolean[] resultado = new boolean[conjunto.length];
		for(int index = 0; index < conjunto.length; index++) {
			resultado[index] = other[index] && conjunto[index];
		}
		return resultado;
	}
	
	public boolean insertElement(int element) {
		if(element <= TAMANIO_CONJUNTO) {
			conjunto[element] = true;
			return true;
		}
		return false;
	}
	
	public boolean deleteElement(int element) {
		if(element <= TAMANIO_CONJUNTO) {
			conjunto[element] = false;
			return true;
		}
		return false;
	}
	
	public String toSetString() {
		String result = "";
		for(int index = 0; index < conjunto.length; index++) {
			if(conjunto[index]) {
				result += String.valueOf(index) + " ";
			}
		}
		if(result.length() == 0) {
			result = "-";
		}
		return result;
	}
	
	public boolean equalTo(boolean[] other) {
		if (other.length != conjunto.length) {
			return false;
		} 
		boolean resultado = true;
		for(int index = 0; index < conjunto.length; index++) {
			if(other[index] != conjunto[index]) {
				resultado = false;
				break;
			}
		}
		return resultado;
	}

	public boolean[] getConjunto() {
		return conjunto;
	}

	public void setConjunto(boolean[] conjunto) {
		this.conjunto = conjunto;
	}

	public static void main(String[] args) {
		IntegerSet integerSet1 = new IntegerSet();
		integerSet1.insertElement(5);
		integerSet1.insertElement(6);
		integerSet1.insertElement(2);
		integerSet1.insertElement(3);
		System.out.println(integerSet1.toSetString());
		IntegerSet integerSet2 = new IntegerSet();
		integerSet2.insertElement(4);
		integerSet2.insertElement(3);
		integerSet2.insertElement(2);
		integerSet2.insertElement(1);
		System.out.println(integerSet2.toSetString());
		integerSet2.deleteElement(4);
		System.out.println(integerSet2.toSetString());
		System.out.println(integerSet1.equalTo(integerSet2.getConjunto()));
		boolean[] interseccion = integerSet1.interseccion(integerSet2.getConjunto());
		System.out.println(Arrays.toString(interseccion));
		boolean[] union = integerSet1.union(integerSet2.getConjunto());
		System.out.println(Arrays.toString(union));
	}
}
