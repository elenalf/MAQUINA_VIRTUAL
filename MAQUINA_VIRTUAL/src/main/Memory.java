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
		this.size = 0;
		this.isEmpty = true;
	}

	/**
	 * Metodo que convierte el array en un String. Forma toda la linea de codigo que tiene que imprimir
	 * 
	 * @return Retorna el array convertido en un String
	 */
	public String toString() {
		//retorna la cadena formada
		return chain;

	}

	/**
	 * Metodo que escribe el valor que el usuario indique
	 * 
	 * @param pos   Es la posicion donde se desea escribir. Si la posicion
	 * @param value Es el valor que se desea escribir
	 * @return Retorna true si se ha podido escribir, sino retorna false
	 */
	public boolean write(int pos, int value) {
		//if(pos >= 0)
		//else
		//return false
		// se llama a resize y que compruebe si se necesita hacer un resize 
		//this.memory[pos] = value; //se escribe el valor
		
	}

	/**
	 * Metodo que lee valores
	 * 
	 * @param pos Es la posicion que se desea leer
	 * @return Retorna el valor que ha leido el metodo
	 */
	public Integer read(int pos) {
		if(this.memory[pos] == null) {
			return -1;
		}else {
			return this.memory[pos];
		}
		
	}

	/**
	 * Metodo que va aumentando el tamaño de nuestro array
	 */
	private void resize(int pos) {
		//empty = false; la pone a false ya que significa que el array no va a estar vacio
		//if(pos>= this.size){
			//Aumentamos la posicion al doble al igual que el size
		//hay que crear un nuevo array cuyo tamaño sea pos * 2
		//se copian todos los valores que habian en el antiguo array, el resto de posiciones que no esten ocupadas se ponen a null
		// this.memory = new array (array 2)
	}

}
