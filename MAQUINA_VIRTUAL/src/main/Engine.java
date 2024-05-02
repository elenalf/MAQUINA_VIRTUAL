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

	private ByteCodeProgram program; // representa el programa actual
	private boolean end; // acabar con la ejecución
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
	 */
	public boolean CommandHelp() {
		System.out.println("   HELP - Muestra esta ayuda \n" + "   QUIT - Cierra la aplicación \n"
				+ "   RUN - Ejecuta el programa \n" + "   NEWINST BYTECODE - Introduce una nueva instrucción al programa \n"
				+ "   RESET - Vacía el programa actual \n"
				+ "   REPLACE N - Reemplaza la instrucción N por la solicitada al usuario");
		return true;
	}

	/**
	 * Metodo que cierra el programa
	 */
	public boolean CommandQuit() {
		return this.end = true;
	}

	/**
	 * Metodo que ejecuta las instrucciones que el usuario haya introducido por
	 * consola
	 */
	public boolean CommandRun() {
		this.program.runProgram(cpu);
		return true;
	}

	/**
	 * Metodo por el que el usuario va introduciendo las instrucciones del programa
	 */
	public boolean CommandNewinst(ByteCode bc) {
		this.program.setInstruction(bc);
		return true;

	}

	/**
	 * Metodo que vacia el programa
	 */
	public boolean CommandReset() {
		this.program.reset();
		return true;
	}

	/**
	 * Metodo que reemplaza una instruccion por otra que el usuario introduzca
	 */
	public boolean CommandReplace(int param) {
		return true;
		
	}

	/**
	 * Metodo que maneja todo el flujo del programa
	 */
	public void start() {
		while (!this.end) {
			String entrada = this.sc.nextLine();
			Command co = CommandParser.parse(entrada);
			if (co != null) {
				System.out.println("Comienza la ejecucción de " + co.getCommand());
				if (!co.execute(this)) {
					System.out.println(ANSI_RED + "Error: Ejecución incorrecta del comando" + ANSI_RESET);
				}
			} else {
				System.out.println(ANSI_RED + "Error: Comando incorrecto" + ANSI_RESET);
			}

		}
	}
}

/**
 * Es la única clase que imprime mensajes por pantalla - Atributo:
 * ByteCodeProgram - Atributo: CPU - Atributo: booleano = end - Atributo:
 */