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
	
	public CPU() {
		this.pila = new OperandStack();
		this.memoria = new Memory();
		this.halt = true;
	}

	/**
	 * Metodo que se encarga de ejecutar la instruccion que le llega como parametro
	 * modificando la memoria y/o la pila de operandos
	 * 
	 * @param instr es el bytecode que se va a ejecutar
	 * @return si la ejecucion genera un error retorna false
	 */
	public boolean execute(ByteCode instr) {
		String conversion = instr.toString();
		String [] division = conversion.split(" ");
		int numero = Integer.parseInt(division[2]);
		if(division[0] == "newinst") {
			switch(division[1]) {
			case "push":
				this.Push(numero);
				break;
			case "load":
				this.Load(numero);
				break;
			case "store":
				this.Store(numero);
				break;
			case "add":
				this.SumaPila();
				break;
			case "sub":
				this.RestaPila();
				break;
			case "mul":
				this.MultiplicaPila();
				break;
			case "div":
				this.DividePila();
				break;
			case "out":
				this.Out();
				break;
			case "halt":
				this.Halt();
				break;
			default:
				return false;
			}
		}else {
			return false;
		}
	}
		
		//analizar que tipo de bytecode es
		//hacer un switch con todos los tipos de bytecode y se ejecuta en función de los metodos que tenemos: SumaPila, RestaPila...
		//retorna true si se ha podido llevar a cabo la operación(método), sino retorna false
		//
	
	
	public String toString () {
		String cadena_P = this.pila.toString();
		String cadena_M = this.memoria.toString();
		String chain = "El estado de la CPU: " + "\n" + cadena_P + "\n" + cadena_M;
		return chain;
		
	}
	
	public void erase() {
		this.memoria = null;
		this.pila = null;
	}
	
	public boolean isHalt() {
		return this.halt;
		
	}
	
	public void runCPU() {
		this.halt = false;
	}
	
	public boolean SumaPila() {
		int elemento1 = this.pila.pop();
		int elemento2 = this.pila.pop();
		if(elemento1 == -1 || elemento2 == -1) {
			return false;
		}else {
			int resultado = elemento1 + elemento2;
			this.pila.push(resultado);
			return true;
		}	
	}
	
	public boolean RestaPila() {
		int elemento1 = this.pila.pop();
		int elemento2 = this.pila.pop();
		if(elemento1 == -1 || elemento2 == -1) {
			return false;
		}else {
			int resultado = elemento1 - elemento2;
			this.pila.push(resultado);
			return true;
		}
		
	}
	
	public boolean DividePila() {
		int elemento1 = this.pila.pop();
		int elemento2 = this.pila.pop();
		if(elemento1 == -1 || elemento2 == -1) {
			return false;
		}else {
			int resultado = elemento1 / elemento2;
			this.pila.push(resultado);
			return true;
		}
		
	}
	
	public boolean MultiplicaPila() {
		int elemento1 = this.pila.pop();
		int elemento2 = this.pila.pop();
		if(elemento1 == -1 || elemento2 == -1) {
			return false;
		}else {
			int resultado = elemento1 * elemento2;
			this.pila.push(resultado);
			return true;
		}
		
	}
	
	public boolean Push(int n) {
		this.pila.push(n);
		return true;
		
	}
	
	public boolean Load(int pos) {
		int elemento = this.memoria.read(pos);
		this.pila.push(elemento);
		return true;
		
	}
	
	public boolean Store(int pos) {
		int elemento = this.pila.pop();
		if(elemento == -1) {
			return false;
		}else {
			this.memoria.write(pos, elemento);
			return true;
		}
		
		
	}
	
	public boolean Out() {
		System.out.println("El elemento de la cima de la pila es " + this.pila.getCima());
		return true;
		
	}
	
	public boolean Halt() {
		this.halt = false;
		return true;
		
	}
}

/**
 * - Atributo: Tiene un booleano para la condición de parada HALT
 * - Constructora
 * - Método: toString, llamada a los metodos toString de OperandStack y Memory
 * - Método: Erase, borra la pila y la memoria
 * - SumaPila: 
 * - RestaPila: 
 * - DividePila: 
 * - MultiplicaPila: 
 * - Método: execute, 
 */
