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
		String[] division = s.toLowerCase().split(" ");
		switch (division.length) {
		case 1:
			if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("add")) {
				return new ByteCode(ENUM_BYTECODE.ADD);
			} else if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("div")) {
				return new ByteCode(ENUM_BYTECODE.DIV);
			} else if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("mul")) {
				return new ByteCode(ENUM_BYTECODE.MUL);
			} else if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("sub")) {
				return new ByteCode(ENUM_BYTECODE.SUB);
			} else if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("out")) {
				return new ByteCode(ENUM_BYTECODE.OUT);
			} else if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("halt")) {
				return new ByteCode(ENUM_BYTECODE.HALT);
			}
		case 2:
			if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("push")) {
				return new ByteCode(ENUM_BYTECODE.PUSH, Integer.parseInt(division[1]));
			} else if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("load")) {
				return new ByteCode(ENUM_BYTECODE.LOAD, Integer.parseInt(division[1]));
			} else if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("store")) {
				return new ByteCode(ENUM_BYTECODE.STORE, Integer.parseInt(division[1]));
			}
		default:
			return null;
		}
	}
}
