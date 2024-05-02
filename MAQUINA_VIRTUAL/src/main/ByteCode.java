package main;

/**
 * Clase ByteCode
 * 
 * @author elena
 */
public class ByteCode {
	/**
	 * Atributos
	 */
	private ENUM_BYTECODE name;
	private int param; // es necesario para las intrucciones PUSH, STORE y LOAD
	
	/**
	 * Constructora 1
	 * @param bc es un bytecode
	 */
	public ByteCode(ENUM_BYTECODE bc) {
		this.name = bc;
	}
	/**
	 * Constructora 2
	 * @param bc es un bytecode
	 * @param num es un parametro
	 */
	public ByteCode(ENUM_BYTECODE bc, int num) {
		this.name = bc;
		this.param = num;
	}
	
	/**
	 * @return
	 */
	public String toString() {
		String chain = this.name.toString().toUpperCase() + this.param;
		return chain;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getInstruction() {
		return this.name.toString();
	}
	
	
	/**
	 * 
	 * @return
	 */
	public int getparam() {
		return this.param;
	}
}