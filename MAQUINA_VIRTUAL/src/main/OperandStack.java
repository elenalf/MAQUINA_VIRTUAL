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
	 * Metodo que convierte el array en un String. Retorna los elementos del array
	 * de manera formal pero no los imprime, se utilizará en otros metodos.
	 * 
	 * @return Retorna el array convertido en un String
	 */
	public String toString() {
		// retorna la cadena de String si tiene algo
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
	 * Metodo que aniade elementos al array.
	 * 
	 * @param element es el elemento que se desea aniadir en el array stack
	 * 
	 * @return Retorna true si se ha podido aniadir el elemento correctamente, sino
	 *         false
	 */
	public boolean push(int element) {
		if (this.stack.length < this.MAX_STACK) {
			this.stack[this.num_elements] = element;
			this.num_elements++;
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Metodo que coge el ultimo elemento del array y lo elimina. El ultimo elemento
	 * es num_element -1
	 * 
	 * Complejidad = 0(1) ya que no variara en funcion del tamanio del dato
	 * 
	 * @return Retorna -1 si el array esta vacio, sino retorna el elemento que se
	 *         encuentre en la ultima posicion
	 */
	public int pop() {
		if(this.isEmpty()) {
			return -1;
		}else {
			int eliminar;
			eliminar = this.stack[this.num_elements - 1];
			return eliminar;
			
		}

	}

	/**
	 * Metodo que nos indica cual es el ultimo elemento del array
	 * 
	 * @return Retorna -1 si no es posible retornar la cima, sino devuelve el ultimo
	 *         elemento
	 */
	public int getCima() {
		if(this.isEmpty()) {
			return -1;
		}else {
			return this.stack[this.num_elements - 1];
		}
	}

}
