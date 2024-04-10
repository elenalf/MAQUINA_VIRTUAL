package main;

/**
 * Clase Memory
 * 
 * @author elena
 */

public class Memory {
	/**
	 * Atributos
	 */
	private int[] memory;
	private final int MAX_MEMORY;
	private int size;

	/**
	 * Constructora
	 */
	public Memory() {
		this.MAX_MEMORY = 10;
		this.memory = new int[this.MAX_MEMORY];
		this.size = 0;
	}

	/**
	 * Metodo que convierte el array en un String
	 * 
	 * @return Retorna el array convertido en un String
	 */
	public String toString() {

	}

	/**
	 * Metodo que escribe el valor que el usuario indique
	 * 
	 * @param pos   Es la posicion donde se desea escribir
	 * @param value Es el valor que se desea escribir
	 * @return Retorna true si se ha podido escribir, sino retorna false
	 */
	public boolean write(int pos, int value) {

	}

	/**
	 * Metodo que lee valores
	 * 
	 * @param pos Es la posicion que se desea leer
	 * @return Retorna el valor que ha leido el metodo
	 */
	public Integer read(int pos) {

	}

	/**
	 * Metodo que va aumentando el tamaño de nuestro array
	 */
	public void resize(int pos) {

	}

}
