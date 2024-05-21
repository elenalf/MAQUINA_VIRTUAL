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
	private ENUM_COMMAND command;
	private ByteCode instruction;
	private int replace;

	/**
	 * Constructora 1
	 * 
	 * @param com es un comando
	 */
	public Command(ENUM_COMMAND com) {
		this.command = com;
	}

	/**
	 * Constructora 2
	 * 
	 * @param com es un comando
	 * @param bc  es un ByteCode
	 */
	public Command(ENUM_COMMAND com, ByteCode bc) {
		this.command = com;
		this.instruction = bc;
	}

	/**
	 * Constructora 3
	 * 
	 * @param com es un comando
	 * @param num es el numero que hace referencia al comando REPLACE
	 */
	public Command(ENUM_COMMAND com, int num) {
		this.command = com;
		this.replace = num;
	}

	/**
	 * Metodo que lleva a cabo la ejecucion del comando introducido por consola
	 * 
	 * @param engine
	 * @return retorna true si el comando es correcto, sino retornara false
	 */
	public boolean execute(Engine engine) {
		switch (this.command) {
		case HELP:
			return engine.CommandHelp();
		case QUIT:
			return engine.CommandQuit();
		case RUN:
			return engine.CommandRun();
		case REPLACE:
			return engine.CommandReplace(this.replace);
		case RESET:
			return engine.CommandReset();
		case NEWINST:
			return engine.CommandNewinst(this.instruction);
		default:
			return false;
		}
	}

	/**
	 * Metodo que devuelve el nombre del comando
	 * 
	 * @return devuelve el nombre del comando
	 */
	public ENUM_COMMAND getCommand() {
		return this.command;
	}

	/**
	 * Metodo que devuelve el nombre del ByteCode
	 * 
	 * @return devuelve el nombre del ByteCode
	 */
	public ByteCode getInstruction() {
		return this.instruction;
	}

	/**
	 * Metodo que devuelve el numero que hace referencia al Comando REPLACE
	 * 
	 * @return devuelve el numero que hace referencia al Comando REPLACE
	 */
	public int getReplace() {
		return this.replace;
	}
}