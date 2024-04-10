package main;

import java.util.Scanner;

/**
 * Clase Engine
 * 
 * @author elena
 */

public class Engine {
	
	/**
	 * Atributos
	 */
	
	private ByteCodeProgram program;
	private boolean end;
	//pluggling para cambiar el color del texto
	public static final String ANSI_RED = "\u001B[31m";
	
	
	/**
	 * Metodo que muestra el menu de funcionamiento del programa
	 */
	public void menu() {
		System.out.println("   HELP - Muestra esta ayuda");
		System.out.println("   QUIT - Cierra la aplicación");
		System.out.println("   RUN - Ejecuta el programa");
		System.out.println("   NEWINST BYTECODE - Introduce una nueva instrucción al programa");
		System.out.println("   RESET - Vacía el programa actual");
		System.out.println("   REPLACE N - Reemplaza la instrucción N por la solicitada al usuario");
	}

	/**
	 * Metodo que cierra el programa
	 */
	public void quit() {

	}

	/**
	 * Metodo que ejecuta las instrucciones que el usuario haya introducido por
	 * consola
	 */
	public void run() {

	}

	/**
	 * Metodo por el que el usuario va introduciendo las instrucciones del programa
	 */
	public void newinst_bytecode() {

	}

	/**
	 * Metodo que vacia el programa
	 */
	public void reset() {

	}

	/**
	 * Metodo que reemplaza una instruccion por otra que el usuario introduzca
	 */
	public void replace() {

	}

	/**
	 * Metodo que maneja todo el flujo del programa
	 */
	public void start() {
		Scanner sc = new Scanner(System.in);
		menu();
		System.out.println();
		System.out.println("¿Qué instrucción desea ejecutar? Por favor respete la sintaxis: ");
		String opcion = sc.nextLine();
		System.out.println(ANSI_RED + "Comienza la ejecucción de " + opcion.toUpperCase());
		System.out.println();

	}
}
