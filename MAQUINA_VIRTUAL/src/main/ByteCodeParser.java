package main;

/**
 * Clase ByteCodeParser
 * 
 * @author elena
 */

public class ByteCodeParser {

	/**
	 * Metodo en el que se analiza un String que contiene un posible bytecode
	 * 
	 * Complejidad = 0(n) donde n es el tamanio de la cadena de tipo String
	 * 
	 * @param s es la cadena de texto que puede contener un bytecode
	 * @return devuelve el bytecode que se encuentre en s o se devuelve null si no
	 *         coincide con ningun bytecode
	 */
	public static ByteCode parse(String s) {
		String[] division = s.split(" ");
		if (division.length == 2) {
			if(division[1] != null) {
				switch(division[0]) {
				case "push":
					return new ByteCode(ENUM_BYTECODE.PUSH, Integer.parseInt(division[1]));
				case "load":
					return new ByteCode(ENUM_BYTECODE.LOAD, Integer.parseInt(division[1]));
				case "store":
					return new ByteCode(ENUM_BYTECODE.STORE, Integer.parseInt(division[1]));
				default:
					return null;
				}
			}else {
				return null;
			}
		}else if(division.length == 1) {
			switch(division[0]) {
			case "add":
				return new ByteCode(ENUM_BYTECODE.ADD);
			case "div":
				return new ByteCode(ENUM_BYTECODE.DIV);
			case "mul":
				return new ByteCode(ENUM_BYTECODE.MUL);
			case "sub":
				return new ByteCode(ENUM_BYTECODE.SUB);
			case "out":
				return new ByteCode(ENUM_BYTECODE.OUT);
			case "halt":
				return new ByteCode(ENUM_BYTECODE.HALT);
			default:
				return null;
			}
		}else {
			return null;
		}
	}
}
