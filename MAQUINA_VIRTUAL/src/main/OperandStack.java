package main;

/**
 * Clase OperandStack
 * 
 * @author elena
 */
public class OperandStack {
	/**
	 * Atributos
	 */
	private int MAX_STACK;
	private int[] stack;
	private int num_elements;

	/**
	 * Constructora
	 */
	public OperandStack() {
		this.MAX_STACK = 10;
		this.stack = new int[this.MAX_STACK];
		this.num_elements = 0;
	}

	/**
	 * Metodo que convierte el array en un String
	 * 
	 * @return Retorna el array convertido en un String
	 */
	public String toString() {

	}

	/**
	 * Metodo que pregunta a nuestro array si esta vacio
	 * 
	 * Complejidad =
	 * 
	 * @return Retorna true si el array esta vacio, sino retorna false
	 */
	public boolean isEmpty() {

	}

	/**
	 * Metodo que anade elementos al array.
	 * 
	 * Complejidad =
	 */
	public void push() {

	}

	/**
	 * Metodo que coge el ultimo elemento del array y lo elimina
	 * 
	 * Complejidad =
	 * 
	 * @return Retorna -1 si el array esta vacio, sino retorna el elemento que se
	 *         encuentre en la ultima posicion
	 */
	public int pop() {

	}

	/**
	 * Metodo que nos indica cual es el ultimo elemento del array
	 */
	public void getCima() {

	}

}
