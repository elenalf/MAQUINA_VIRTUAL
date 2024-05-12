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
	 * Complejidad: 0(n) donde n es el numero de elementos que hay en la pila,
	 * 
	 * @return Retorna el array convertido en un String
	 */
	public String toString() {
		String chain_P = "Pila:";
		if (this.isEmpty()) {
			chain_P += " <vacía>";
		} else {
			for (int i = 0; i < this.num_elements; i++) {
				String numero = " " + this.stack[i] + "  ";
				chain_P += numero;
			}
		}
		return chain_P;
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
	 * Complejidad: 0(1) ya que no variara en funcion del tamanio del dato
	 * 
	 * @param element es el elemento que se desea aniadir en el array stack
	 * 
	 * @return Retorna true si se ha podido aniadir el elemento correctamente, sino
	 *         false
	 */
	public boolean push(int element) {
		if (this.num_elements < this.MAX_STACK) {
			this.stack[this.num_elements] = element;
			this.num_elements++;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que coge el ultimo elemento del array y lo elimina.
	 * 
	 * Complejidad = 0(1) ya que no variara en funcion del tamanio del dato
	 * 
	 * @return Retorna -1 si el array esta vacio, sino retorna el elemento que se
	 *         encuentre en la ultima posicion
	 */
	public int pop() {
		if (this.isEmpty()) {
			return -1;
		} else {
			int ultimo = this.stack[this.num_elements - 1];
			this.stack[this.num_elements - 1] = 0;
			this.num_elements--;

			return ultimo;
		}
	}

	/**
	 * Metodo que nos indica cual es el ultimo elemento del array
	 * 
	 * Complejidad: 0(1) ya que no variara en funcion del tamanio del dato.
	 * 
	 * @return Retorna -1 si no es posible retornar la cima, sino devuelve el ultimo
	 *         elemento
	 */
	public int getCima() {
		if (this.isEmpty()) {
			return -1;
		} else {
			return this.stack[this.num_elements - 1];
		}
	}
}
