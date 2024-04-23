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
		//Ejemplo de cadena de texto de longitud 2. 
		if (fragment[0].equalsIgnoreCase("NEWINST")) {
			return new Command(ENUM_COMMAND.NEWINST, ByteCodeParser.parse(fragment[1]));

		}
	}
}
