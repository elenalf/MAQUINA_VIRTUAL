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
	private final int MAX_STACK;
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
	 * Metodo que convierte el array en un String. Retorna los elementos del array de manera formal pero no los imprime,
	 * se utilizará en otros métodos.
	 * 
	 * @return Retorna el array convertido en un String
	 */
	public String toString() {
		//retorna la cadena de String si tiene algo
		return chain;

	}

	/**
	 * Metodo que pregunta a nuestro array si esta vacio
	 * 
	 * @return Retorna true si el array esta vacio, sino retorna false
	 */
	public boolean isEmpty() {
		return this.num_elements == 0;

	}

	/**
	 * Metodo que anade elementos al array.
	 * 
	 * Complejidad =
	 * 
	 * @param element es el elemento que se desea anadir en el array stack
	 * 
	 * @return Retorna true si se ha podido anadir el elemento correctamente, sino false
	 */
	public boolean push(int element) {
		
	}

	/**
	 * Metodo que coge el ultimo elemento del array y lo elimina. El último elemento es num_element -1
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
	 * 
	 * @return Retorna -1 si no es posible retornar la cima, sino devuelve el ultimo elemento
	 */
	public int getCima() {
		System.out.println("El elemento que se encuentra en la cima de la pila es " + this.stack[this.num_elements - 1]);
	}

}
