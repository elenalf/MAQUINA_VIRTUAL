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
	 *         coincide con ningun bytecode
	 */
	public static ByteCode parse(String s) {
		String[] division = s.split(" ");
		switch (division.length) {
		case 1:
			if (division[0].equalsIgnoreCase("add")) {
				return new ByteCode(ENUM_BYTECODE.ADD);
			} else if (division[0].equalsIgnoreCase("div")) {
				return new ByteCode(ENUM_BYTECODE.DIV);
			} else if (division[0].equalsIgnoreCase("mul")) {
				return new ByteCode(ENUM_BYTECODE.MUL);
			} else if (division[0].equalsIgnoreCase("sub")) {
				return new ByteCode(ENUM_BYTECODE.SUB);
			} else if (division[0].equalsIgnoreCase("out")) {
				return new ByteCode(ENUM_BYTECODE.OUT);
			} else if (division[0].equalsIgnoreCase("halt")) {
				return new ByteCode(ENUM_BYTECODE.HALT);
			}
		case 2:
			if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("push")) {
				return new ByteCode(ENUM_BYTECODE.PUSH);
			} else if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("load")) {
				return new ByteCode(ENUM_BYTECODE.LOAD);
			} else if (division[0].equalsIgnoreCase("newinst") && division[1].equalsIgnoreCase("store")) {
				return new ByteCode(ENUM_BYTECODE.STORE);
			}
		default:
			return null;
		}
	}
}
