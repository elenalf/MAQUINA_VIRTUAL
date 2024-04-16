package main;

/**
 * Clase ByteCodeParser
 * 
 * @author elena
 */

public class ByteCodeParser {

	/**
	 * Analiza un string que contiene un posible bytecode
	 * 
	 * @param s es la cadena de texto que puede contener un bytecode
	 * @return devuelve el bytecode que se encuentre en s o se devuelve null si no
	 *         hay ningun bytecode
	 */
	public static ByteCode parse(Sring s) {
		// particionar el string (hacer un split)
		// si el array tiene tamano 0, se devuelve null
		// si tiene tamano 1, un switch para ver las posibilidades que pueden ser, si no
		// coincide con ninguna se retorna null, sino
		// ej: new ByteCode (ENUM_BYTECODE.ADD);
		// si el array tiene tamano 2, hacer otro switch para ver las otras
		// posibilidades, si no coincide se retorna null, sino ej:new ByteCode
		// (ENUM_BYTECODE.PUSH)
	}
}
