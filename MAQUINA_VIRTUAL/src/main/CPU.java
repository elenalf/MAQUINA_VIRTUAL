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
	private OperandStack pila;
	private Memory memoria;
	private boolean halt;

	/**
	 * Constructora
	 */
	public CPU() {
		this.pila = new OperandStack();
		this.memoria = new Memory();
		this.halt = false;
	}

	/**
	 * Metodo que se encarga de ejecutar la instruccion que le llega como parametro
	 * modificando la memoria y/o la pila de operandos
	 * 
	 * @param instr es el ByteCode que se va a ejecutar
	 * @return si la ejecucion genera un error retorna false
	 */
	public boolean execute(ByteCode instr) {
		switch (instr.getInstruction()) {
		case ADD:
			return SumaPila();
		case MUL:
			return MultiplicaPila();
		case DIV:
			return DividePila();
		case SUB:
			return RestaPila();
		case PUSH:
			return this.pila.push(instr.getparam());
		case LOAD:
			return Load(instr.getparam());
		case STORE:
			return Store(instr.getparam());
		case OUT:
			return Out();
		case HALT:
			return Halt();
		default:
			return false;
		}
	}

	/**
	 * Metodo que convierte el estado de la CPU en un String. Forma toda la linea de
	 * codigo que tiene que imprimir
	 * 
	 * 
	 * @return Retorna el estado de la CPU convertido en un String
	 */
	public String toString() {
		return "Estado de la CPU:" + "\n" + "  " + this.pila.toString() + "\n" + "  " + this.memoria.toString();

	}

	/**
	 * Metodo que reinicia la memoria y la pila
	 */
	public void erase() {
		this.memoria = new Memory();
		this.pila = new OperandStack();
	}

	/**
	 * Metodo que indica si la maquina esta parada o no
	 * 
	 * @return devuelve true si esta parada, si no lo esta devuelve false
	 */
	public boolean isHalt() {
		return this.halt;

	}

	/**
	 * Metodo que lleva a cabo la ejecucion de la CPU, es decir, pone en marcha la
	 * maquina
	 */
	public void runCPU() {
		this.halt = false;

	}

	/**
	 * Metodo que suma la cima y la subcima de la pila
	 * 
	 * @return devuelve true si se ha podido realizar la operacion, de lo contrario,
	 *         devuelve false
	 */
	public boolean SumaPila() {
		this.runCPU();
		if (!this.pila.isEmpty()) {
			int elemento1 = this.pila.pop();
			if (!this.pila.isEmpty()) {
				int elemento2 = this.pila.pop();
				if (elemento1 == -1 || elemento2 == -1) {
					return false;
				} else {
					int resultado = elemento1 + elemento2;
					this.pila.push(resultado);
					return true;
				}
			} else {
				this.pila.push(elemento1);
				return false;
			}

		} else {
			return false;
		}

	}

	/**
	 * Metodo que resta la cima y la subcima de la pila
	 * 
	 * @return devuelve true si se ha podido realizar la operacion, de lo contrario,
	 *         devuelve false
	 */
	public boolean RestaPila() {
		this.runCPU();
		if (!this.pila.isEmpty()) {
			int elemento1 = this.pila.pop();
			if (!this.pila.isEmpty()) {
				int elemento2 = this.pila.pop();
				if (elemento1 == -1 || elemento2 == -1) {
					return false;
				} else {
					int resultado = elemento1 - elemento2;
					this.pila.push(resultado);
					return true;
				}
			} else {
				this.pila.push(elemento1);
				return false;
			}

		} else {
			return false;
		}
	}

	/**
	 * Metodo que divide la cima y la subcima de la pila
	 * 
	 * @return devuelve true si se ha podido realizar la operacion, de lo contrario,
	 *         devuelve false
	 */
	public boolean DividePila() {
		this.runCPU();
		if (!this.pila.isEmpty()) {
			int elemento1 = this.pila.pop();
			if (!this.pila.isEmpty()) {
				int elemento2 = this.pila.pop();
				if (elemento1 == -1 || elemento2 == -1) {
					return false;
				} else {
					int resultado = elemento1 / elemento2;
					this.pila.push(resultado);
					return true;
				}
			} else {
				this.pila.push(elemento1);
				return true;
			}

		} else {
			return false;
		}
	}

	/**
	 * Metodo que multiplica la cima y la subcima de la pila
	 * 
	 * @return devuelve true si se ha podido realizar la operacion, de lo contrario,
	 *         devuelve false
	 */
	public boolean MultiplicaPila() {
		this.runCPU();
		if (!this.pila.isEmpty()) {
			int elemento1 = this.pila.pop();
			if(!this.pila.isEmpty()) {
				int elemento2 = this.pila.pop();
				if (elemento1 == -1 || elemento2 == -1) {
					return false;
				} else {
					int resultado = elemento1 * elemento2;
					this.pila.push(resultado);
					return true;
				}
			}else {
				this.pila.push(elemento1);
				return true;
			}
			
		} else {
			return false;
		}
	}

	/**
	 * Metodo que lee de la memoria el valor que el usuario indique su posicion y lo
	 * aniade a la pila de operandos
	 * 
	 * @param pos es la posicion del elemento de la memoria
	 * @return devuelve true si se ha podido aniadir a la pila de comandos, de lo
	 *         contrario, devuelve false
	 */
	public boolean Load(int pos) {
		this.runCPU();
		int elemento = this.memoria.read(pos);
		if (elemento != -1) {
			this.pila.push(elemento);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que aniade en la memoria en la posicion que indique el usuario el
	 * contenido de la cima de la pila de operandos y lo elimina de esta
	 * 
	 * @param pos es la posicion de la memoria en la que se quiere aniadir la cima
	 *            de la pila de operandos
	 * @return devuelve true si se ha podido aniadir en la memoria, de lo contrario,
	 *         devuelve false
	 */
	public boolean Store(int pos) {
		if (pos > 0) {
			this.halt = false;
			int elemento = this.pila.pop();
			if (elemento == -1) {
				return false;
			} else {
				this.memoria.write(pos, elemento);
				return true;
			}
		} else {
			return false;
		}
	}

	/**
	 * Metodo que escribe el elemento almacenado en la cima de la pila de operandos
	 * 
	 * @return devuelve true si se ha podido escribir, de lo contrario, devuelve
	 *         false
	 */
	public boolean Out() {
		this.runCPU();
		if (!this.pila.isEmpty()) {
			System.out.println("El elemento de la cima de la pila es: " + this.pila.getCima());
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que para la maquina
	 * 
	 * @return devuelve true si se ha podido parar la maquina, de lo contrario,
	 *         devuelve false
	 */
	public boolean Halt() {
		this.halt = true;
		return true;
	}
}