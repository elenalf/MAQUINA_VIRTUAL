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
	 * @param bc  es un bytecode
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
		switch(this.command) {
			case HELP:
				engine.CommandHelp();
				return true;
			case QUIT:
				engine.CommandQuit();
				return true;
			case RUN:
				engine.CommandRun();
				return true;
			case REPLACE:
				engine.CommandReplace(this.replace);
				return true;
			case RESET:
				engine.CommandReset();
				return true;
			case NEWINST:
				engine.CommandNewinst(this.instruction);
				return true;
			default:
				return false;
		}
		
		//if else con todos los comandos disponibles
		//engine va ejecutando todos los comandos 
	}
	
	public ENUM_COMMAND getCommand() {
		return this.command;
	}
	
	public ByteCode getInstruction() {
		return this.instruction;
	}
}
