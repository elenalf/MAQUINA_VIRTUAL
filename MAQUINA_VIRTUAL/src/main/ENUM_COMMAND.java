package main;

/**
 * Enum ENUM_COMMAND
 * 
 * @author elena
 */

public enum ENUM_COMMAND {
	HELP, QUIT, NEWINST(1), RUN, RESET, REPLACE(1);
	private int valueArg;
	
	/**
	 * Constructora
	 */
	ENUM_COMMAND() {
		this.valueArg = 0;
	}
	/**
	 * Constructora
	 * @param n Es el argumento del comando
	 */
	ENUM_COMMAND(int n) {
		this.valueArg = n;
	}
	/**
	 * Devuelve el numero de parametros que tiene un comando
	 * @return El numero de parametros que tiene un comando
	 */
	public int getValueArg(){
		return this.valueArg;
	}
}
