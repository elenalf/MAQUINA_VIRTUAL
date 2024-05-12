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
	private Integer[] memory;
	private final int MAX_MEMORY;
	private int size;
	private boolean isEmpty;

	/**
	 * Constructora
	 */
	public Memory() {
		this.MAX_MEMORY = 10;
		this.memory = new Integer[this.MAX_MEMORY];
		this.size = 10;
		this.isEmpty = true;
	}

	/**
	 * Metodo que convierte el array en un String. Forma toda la linea de codigo que
	 * tiene que imprimir
	 * 
	 * Complejidad: 0(n) donde n es la longitud del array memory
	 * 
	 * @return Retorna el array convertido en un String
	 */
	public String toString() {
		String chain_M = "Memoria:";
		if (isEmpty) {
			chain_M += " <vacía>";
		} else {
			int i = 0;
			while (i < this.memory.length) {
				if (this.memory[i] != null) {
					String numero = " [" + i + "] " + this.memory[i] + "  ";
					chain_M += numero;
				}
				i++;
			}
		}
		return chain_M;
	}

	/**
	 * Metodo que escribe el valor que el usuario indique
	 * 
	 * Complejidad: 0(1) ya que no variara en funcion del tamanio del datos
	 * 
	 * @param pos   Es la posicion donde se desea escribir. Si la posicion
	 * @param value Es el valor que se desea escribir
	 * @return Retorna true si se ha podido escribir, sino retorna false
	 */
	public boolean write(int pos, int value) {
		if (pos >= 0) {
			this.resize(pos);
			this.memory[pos] = value;
			this.isEmpty = false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que lee valores
	 * 
	 * Complejidad: 0(1) ya que no variara en funcion del tamanio del dato
	 * 
	 * @param pos Es la posicion que se desea leer
	 * @return Retorna el valor que ha leido el metodo
	 */
	public Integer read(int pos) {
		if (this.memory[pos] == null) {
			return -1;
		} else {
			return this.memory[pos];
		}
	}

	/**
	 * Metodo que va aumentando el tamaño de nuestro array
	 * 
	 * Complejidad: 0(n) donde n es el tamanio del array memory
	 * 
	 * @param pos Es la posicion a la que se quiere llegar en el array
	 */
	private void resize(int pos) {

		if (pos >= this.size) {
			this.isEmpty = false;
			Integer[] memory2 = new Integer[pos * 2];
			for (int i = 0; i < this.memory.length; i++) {
				memory2[i] = this.memory[i];
			}
			this.memory = memory2;
		}
	}

}
