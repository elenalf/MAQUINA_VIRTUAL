package main;

/**
 * Clase Command
 * 
 * @author elena
 */

public class Command {

	/**
	 * Atributos
	 */
	private ENUM_COMANDO command;
	private ByteCode instruction; // es el valor que se toma cuando se hace referencia al comando NEWINST
	private int replace; // hace referencia al comando REPLACE

	/**
	 * Metodo que lleva a cabo la ejecucion del comando introducido por consola
	 * 
	 * @param engine
	 * @return retorna true si el comando es correcto, sino retornara false
	 */
	public boolean execute(Engine engine) {

	}
}
