package main;

/**
 * Enum ENUM_BYTECODE
 * 
 * @author elena
 */

public enum ENUM_BYTECODE {
	PUSH(1), LOAD(1), STORE(1), ADD, SUB, MUL, DIV, OUT, HALT;

	private int valueArg;

	/**
	 * Constructora
	 */
	ENUM_BYTECODE() {
		this(0);
	}

	/**
	 * Constructora
	 * 
	 * @param n Es el argumento del ByteCode
	 */
	ENUM_BYTECODE(int n) {
		this.valueArg = n;
	}

	/**
	 * Devuelve el numero de parametros que tiene una instruccion
	 * 
	 * @return El numero de parametros que tiene una instruccion
	 */
	public int getValueArg() {
		return this.valueArg;
	}
}
