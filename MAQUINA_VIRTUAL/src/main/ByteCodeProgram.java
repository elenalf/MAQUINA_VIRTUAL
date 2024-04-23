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
 * 
 */
