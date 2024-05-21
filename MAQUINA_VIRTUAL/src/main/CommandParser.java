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
			switch (division[0]) {
			case "help":
				return new Command(ENUM_COMMAND.HELP);
			case "quit":
				return new Command(ENUM_COMMAND.QUIT);
			case "run":
				return new Command(ENUM_COMMAND.RUN);
			case "reset":
				return new Command(ENUM_COMMAND.RESET);
			default:
				return null;
			}
		case 2:
			if (division[1] != null) {
				switch (division[0]) {
				case "replace":
					return new Command(ENUM_COMMAND.REPLACE, Integer.parseInt(division[1]));
				case "newinst":
					return new Command(ENUM_COMMAND.NEWINST, ByteCodeParser.parse(division[1]));
				default:
					return null;
				}
			} else {
				return null;
			}
		case 3:
			switch (division[0]) {
			case "newinst":
				if (division[1] != null) {
					return new Command(ENUM_COMMAND.NEWINST, ByteCodeParser.parse(division[1] + " " + division[2]));
				} else {
					return null;
				}
			default:
				return null;
			}
		default:
			return null;
		}
	}
}