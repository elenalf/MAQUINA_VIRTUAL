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
	// pluggling para cambiar el color del texto
	public static final String ANSI_RED = "\u001B[31m";

	/**
	 * Constructora
	 */
	public ByteCodeProgram() {
		this.program = new ByteCode[this.size];
		this.num_elements = 0;
		this.size = 10;
	}

	/**
	 * Metodo que inicializa el programa, es decir, va ejecutando los bytecode
	 * 
	 * Complejidad = 0(n) donde n es el numero de elementos que hay en el programa
	 * 
	 * @param cpu es el objeto de la clase cpu, necesario para poder ejecutar el
	 *            programa y para saber el estado de la maquina
	 * @return devuelve una cadena de String detallando todo el proceso de ejecucion
	 *         del programa
	 */
	public String runProgram(CPU cpu) {
		String mensaje = "";
		for (int i = 0; i < this.num_elements; i++) {
			if (!cpu.isHalt() && cpu.execute(this.program[i])) {
				mensaje += "El estado de la máquina tras ejecutar el bytecode " + this.toString() + " es: " + "\n";
				cpu.toString();
			} else if (!cpu.isHalt()) {
				mensaje += ANSI_RED + "Ejecución incorrecta del comando";

			}
		}
		cpu.erase();
		cpu.runCPU();
		return mensaje;

	}

	/**
	 * Metodo que aniade al programa nuevas instruciones de tipo bytecode
	 * 
	 * Complejidad = 0(1) ya que no variara en funcion del tamanio del dato
	 * 
	 * @param bc es el bytecode que se va a aniadir al programa
	 */
	public void setInstruction(ByteCode bc) {
		this.resize(this.num_elements);
		this.program[this.num_elements] = bc;
		this.num_elements++;
	}

	/**
	 * Metodo que aniade al programa un nuevo bytecode en una posicion especifica
	 * 
	 * Complejidad = 0(1) ya que no variara en funcion del tamanio del dato
	 * 
	 * @param bc  es el bytecode que se va a aniadir al programa
	 * @param pos es la posicion en la que se va a escribir el bytecode
	 * @return devuelve true si se ha podido aniadir correctamente en el programa,
	 *         de lo contrario, devuelve false
	 */
	public boolean setInstructionPosition(ByteCode bc, int pos) {
		this.resize(pos);
		this.program[pos] = bc;
		this.num_elements++;
		return true;

	}

	/**
	 * Metodo que convierte el programa de tipo ByteCode a un String
	 * 
	 * Complejidad = 0(n) donde n es el tamanio del array programa
	 * 
	 * @return devuelve el programa convertido a tipo String
	 */
	public String toString() {
		String chain = "Programa almacenado: ";
		for (int i = 0; i < this.program.length; i++) {
			chain += i + ": " + this.program[i] + "\n";
		}
		return chain;
	}

	/**
	 * Metodo que va aumentando el tamaño de nuestro programa
	 * 
	 * Complejidad: 0(n) donde n es el tamanio del array program
	 * 
	 * @param pos Es la posicion a la que se quiere llegar en el programa
	 */
	private void resize(int pos) {
		if (pos >= this.size) {
			ByteCode[] program2 = new ByteCode[this.size * 2];
			for (int i = 0; i < this.program.length; i++) {
				program2[i] = this.program[i];
			}
			this.program = program2;
		}
	}

	/**
	 * Metodo que devuelve el ultimo bytecode del programa
	 * 
	 * Complejidad = 0(1) ya que no variara en funcion del tamanio del dato
	 * 
	 * @return retorna la ultima instruccion del programa
	 */
	public ByteCode getInstruction() {
		return this.program[this.num_elements];
	}

	/**
	 * Metodo que devuelve el bytecode en la posicion pos del programa
	 * 
	 * Complejidad = 0(1) ya que no variara en funcion del tamanio del dato
	 * 
	 * @param pos es la posicion en la que se desea saber que bytecode hay
	 * @return devuelve el bytecode en la posicion indicada
	 */
	public ByteCode getInstructionPosition(int pos) {
		return this.program[pos];
	}

	/**
	 * Metodo que resetea nuestro programa, es decir, vacia el programa y pone a 0
	 * el numero de elementos
	 * 
	 * Complejidad = 0(1) ya que no variara en funcion del tamanio del dato
	 */
	public void reset() {
		this.program = new ByteCode[this.size];
		this.num_elements = 0;
	}
}