package main;

import java.util.Scanner;

/**
 * Clase Engine
 * 
 * @author elena
 */

public class Engine {
	// pluggling para cambiar el color del texto
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\033[0m";

	/**
	 * Atributos
	 */

	private ByteCodeProgram program;
	private boolean end;
	private Scanner sc;
	private CPU cpu;

	/**
	 * Constructora
	 */
	public Engine() {
		this.end = false;
		this.program = new ByteCodeProgram();
		this.sc = new Scanner(System.in);
		this.cpu = new CPU();
	}

	/**
	 * Metodo que muestra el menu de funcionamiento del programa
	 * 
	 * @return devuelve true si se ha podido ejecutar, de lo contrario, devuelve
	 *         false
	 */
	public boolean CommandHelp() {
		System.out.println("   HELP - Muestra esta ayuda \n" + "   QUIT - Cierra la aplicación \n"
				+ "   RUN - Ejecuta el programa \n"
				+ "   NEWINST BYTECODE - Introduce una nueva instrucción al programa \n"
				+ "   RESET - Vacía el programa actual \n"
				+ "   REPLACE N - Reemplaza la instrucción N por la solicitada al usuario");
		return true;
	}

	/**
	 * Metodo que finaliza el programa
	 * 
	 * @return devuelve true si se ha podido ejecutar, de lo contrario, devuelve
	 *         false
	 */
	public boolean CommandQuit() {
		System.out.println(this.program.toString());
		System.out.println("Saliendo del sistema...");
		this.end = true;
		return true;
	}

	/**
	 * Metodo que ejecuta las instrucciones que el usuario haya introducido por
	 * consola
	 * 
	 * @return devuelve true si se ha podido ejecutar, de lo contrario, devuelve
	 *         false
	 */
	public boolean CommandRun() {
		System.out.println(this.program.runProgram(this.cpu));
		System.out.println(this.program.toString());
		return true;
	}

	/**
	 * Metodo por el que el usuario va introduciendo las instrucciones del programa
	 * 
	 * @return devuelve true si se ha podido ejecutar, de lo contrario, devuelve
	 *         false
	 */
	public boolean CommandNewinst(ByteCode bc) {
		if (bc.getInstruction() != null) {
			this.program.setInstruction(bc);
			System.out.println(this.program.toString());
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que vacia el programa
	 * 
	 * @return devuelve true si se ha podido ejecutar, de lo contrario, devuelve
	 *         false
	 */
	public boolean CommandReset() {
		this.program.reset();
		return true;
	}

	/**
	 * Metodo que reemplaza una instruccion por otra que el usuario introduzca
	 * 
	 * @return devuelve true si se ha podido ejecutar, de lo contrario, devuelve
	 *         false
	 */
	public boolean CommandReplace(int param) {
		if (param < this.program.programSize()) {
			System.out.println("Nueva instruccion: ");
			String entrada = sc.nextLine();
			ByteCode bc = ByteCodeParser.parse(entrada);
			this.program.setInstructionPosition(bc, param);
			System.out.println(this.program.toString());
			return true;
		} else {
			System.out.println(ANSI_RED + "No se ha podido ejecutar el comando Replace" + ANSI_RESET);
			System.out.println(this.program.toString());
			return false;
		}
	}

	/**
	 * Metodo que inicializa el programa
	 */
	public void start() {
		while (!this.end) {
			String entrada = this.sc.nextLine();
			Command co = CommandParser.parse(entrada);
			if (co != null) {
				System.out.println("Comienza la ejecucción de " + entrada.toUpperCase() + "\n");
				if (co.execute(this)) {

				} else {
					System.out.println(ANSI_RED + "Error: Ejecución incorrecta del comando" + ANSI_RESET);
				}
			} else {
				System.out.println(ANSI_RED + "Error: Comando incorrecto" + ANSI_RESET);
			}
		}
	}
}