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
		System.out.println("   HELP - Muestra esta ayuda" +
		"   QUIT - Cierra la aplicación" +
		"   RUN - Ejecuta el programa" +
		"   NEWINST BYTECODE - Introduce una nueva instrucción al programa" +
		"   RESET - Vacía el programa actual" +
		"   REPLACE N - Reemplaza la instrucción N por la solicitada al usuario");
		return true;
	}

	/**
	 * Metodo que cierra el programa
	 */
	public boolean CommandQuit() {
		System.out.println("Has salido del programa");
		return true;
	}

	/**
	 * Metodo que ejecuta las instrucciones que el usuario haya introducido por
	 * consola
	 */
	public boolean CommandRun() {
		
	}

	/**
	 * Metodo por el que el usuario va introduciendo las instrucciones del programa
	 */
	public boolean CommandNewinst(ByteCode bc) {
		this.program.setInstruction(bc);

	}

	/**
	 * Metodo que vacia el programa
	 */
	public boolean CommandReset() {
		this.program.reset();
	}

	/**
	 * Metodo que reemplaza una instruccion por otra que el usuario introduzca
	 */
	public boolean CommandReplace(int param) {

	}

	/**
	 * Metodo que maneja todo el flujo del programa
	 */
	public void start() {
		while (!this.end) {
			String entrada = this.sc.nextLine();
			Command co = CommandParser.parse(entrada);
			System.out.println("Comienza la ejecucción de " + entrada.toUpperCase());
			if (co != null) {
				if (!co.execute(this)) { 
					System.out.println(ANSI_RED + "Error: Ejecución incorrecta del comando");
				}
			} else {
				System.out.println(ANSI_RED + "Error: Comando incorrecto");
			}

		}
	}
}

/**
 * Es la única clase que imprime mensajes por pantalla - Atributo:
 * ByteCodeProgram - Atributo: CPU - Atributo: booleano = end - Atributo:
 */