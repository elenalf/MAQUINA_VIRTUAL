package main;

/**
 * Clase CPU
 * 
 * @author elena
 */

public class CPU {
	/**
	 * Atributos
	 */
	private OperandStack pila = new OperandStack();
	private Memory memoria = new Memory();

	/**
	 * Metodo que se encarga de ejecutar la instruccion que le llega como parametro
	 * modificando la memoria y/o la pila de operandos
	 * 
	 * @param instr es el bytecode que se va a ejecutar
	 * @return si la ejecucion genera un error retorna false
	 */
	public boolean execute(ByteCode instr) {
		//analizar que tipo de bytecode es
		//hacer un switch con todos los tipos de bytecode y se ejecuta en función de los metodos que tenemos: SumaPila, RestaPila...
		//retorna true si se ha podido llevar a cabo la operación(método), sino retorna false
		//
	}
	
	public String toString () {
		
	}
	
	public void erase() {
		
	}
	
	public boolean isHalt() {
		
	}
	
	public boolean SumaPila() {
		
	}
	
	public boolean RestaPila() {
		
	}
	
	public boolean DividePila() {
		
	}
	
	public boolean MultiplicaPila() {
		
	}
}

/**
 * - Atributo: Tiene una pila de tipo OperandStack (Objeto)
 * - Atributo: Tiene una memoria de tipo Memory (Objeto)
 * - Atributo: Tiene un booleano para la condición de parada HALT
 * - Constructora
 * - Método: toString, llamada a los metodos toString de OperandStack y Memory
 * - Método: Erase, borra la pila y la memoria
 * - Método: isHalt, te dice si el atributo booleano esta true o false (Está parada la máquina virtual o no)
 * - SumaPila: 
 * - RestaPila: 
 * - DividePila: 
 * - MultiplicaPila: 
 * - Método: execute, 
 */
