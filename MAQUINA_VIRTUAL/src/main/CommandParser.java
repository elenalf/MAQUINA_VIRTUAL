package main;

/**
 * Clase CommandParser
 * 
 * @author elena
 */
public class CommandParser {

	/**
	 * Metodo que analiza la cadena de texto que el usuario introduce por consola
	 * 
	 * @param line es la cadena de texto que el usuario introduce por consola
	 * @return si line no corresponde con la sintaxis de algun comando retorna null
	 */
	public static Command parse(String line) {
		String[] division = line.toLowerCase().split(" ");
		switch (division.length) {
		case 1:
			if (division[0].equalsIgnoreCase("help")) {
				return new Command(ENUM_COMMAND.HELP);
			} else if (division[0].equalsIgnoreCase("quit")) {
				return new Command(ENUM_COMMAND.QUIT);
			} else if (division[0].equalsIgnoreCase("run")) {
				return new Command(ENUM_COMMAND.RUN);
			} else if (division[0].equalsIgnoreCase("reset")) {
				return new Command(ENUM_COMMAND.RESET);
			}
		case 3:
			if (division[0].equalsIgnoreCase("newinst")) {
				return new Command(ENUM_COMMAND.NEWINST, ByteCodeParser.parse(division[1]));
			} else if (division[0].equalsIgnoreCase("replace")) {
				return new Command(ENUM_COMMAND.REPLACE, Integer.parseInt(division[1]));
			}
		default:
			return null;
		}
	}
}
