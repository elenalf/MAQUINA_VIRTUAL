package main;

/**
 * Clase ByteCodeProgram
 * 
 * @author elena
 */

public class ByteCodeProgram {
	/**
	 * Atributos
	 */
	private ByteCode[] program;
	private int num_elements;
	private int size;
	
	public ByteCodeProgram() {
		this.program = new ByteCode[this.size];
		this.num_elements = 0;
		this.size = 1;
	}
	
	public String runProgram(CPU cpu) {
		String mensaje = "";
		for(int i = 0; i < this.num_elements; i++) { //Ejecuta todas las instrucciones que tenga el programa
			if(!cpu.isHalt() && cpu.execute(this.program[i])) { //Si no está parada y no hay error en la ejecución
				//se forma la cadena 
			}else if(!cpu.isHalt()) { //Si hay error en la ejecución
				//se forma la cadena indicando los errores
			}
		}
		cpu.erase(); //Al terminar el programa limpiamos la CPU
		cpu.runCPU(); //Y la volemos a poner en marcha (por si anteriormente estaba parada)
		return mensaje;
		//Recorre los num_elements del array program --> for(int i = 0; i < this.num_elements; i++);
		//Para que se puedan "ejecutar" ---> this.program[i].toString();
		//Concatenación de todo cpu + operandStack + memory
	}
	
	public void setInstrucion(ByteCode bc) {
		this.program[this.num_elements] = bc;
		this.num_elements ++;
	}
	
	public String toString() {
		String chain = "Programa almacenado: ";
		for(int i = 0; i < this.program.length; i++) {
			chain += this.program[i];
		}
		return chain;
	}
}
/**
 * - Atributo: array de tipo bytecode
 * - Atributo: num_element es el numero de elementos del array
 * - Atributo: size es el tamaño del array
 *   Funciona igual que la memory, cuando el array se llena hay que hacer un resize(size*2)
 * - Metodos de tipo getters
 * - Metodo que devuelve la instrucción iésima
 * - Metodo que inserta el bytecode bc en la posición pos --> boolean setInstructionPosition(Bytecode bc, int pos) funciona para el replace
 * - void setInstruction(Bytecode bc): inserta un bytecode de manera secuencial 
 * - String toString(Programa almacenado: )
 * - runProgram: recorre todo el array y va a ejecutar todos los bytecode
 * - Crear un método (reset) inicializa el array de bytecodes y el num_elements = 0
 * 
 */
