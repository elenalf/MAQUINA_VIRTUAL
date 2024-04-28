package main;

/**
 * Clase CommandParser
 * 
 * @author elena
 */
//Es igual que ByteCodeParser
//Hay que hacer una llamada a la clase ByteCodeParser
public class CommandParser {

	/**
	 * Metodo que analiza la cadena de texto que el usuario introduce por consola
	 * 
	 * @param line es la cadena de texto que el usuario introduce por consola
	 * @return si line no corresponde con la sintaxis de algun comando retorna null
	 */
	public static Command parse(String line) {
		String [] division = line.split(" ");
		switch(division.length) {
			case 1:
				if(division[0].equalsIgnoreCase("help")) {
					return new Command(ENUM_COMMAND.HELP);
				}else if(division[0].equalsIgnoreCase("quit")) {
					return new Command(ENUM_COMMAND.QUIT);
				}else if(division[0].equalsIgnoreCase("run")) {
					return new Command(ENUM_COMMAND.RUN);
				}else if(division[0].equalsIgnoreCase("reset")) {
					return new Command(ENUM_COMMAND.RESET);
				}
			case 2:
				if(division[0].equalsIgnoreCase("newinst")) {
					return new Command(ENUM_COMMAND.NEWINST, ByteCodeParser.parse(division[1]));
				}else if(division[0].equalsIgnoreCase("replace")) {
					return new Command(ENUM_COMMAND.REPLACE);
				}
		}
	}
}
/**
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
**/