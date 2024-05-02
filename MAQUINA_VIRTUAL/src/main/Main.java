package main;

/**
 * Clase Main
 * 
 * @author elena
 */
public class Main {

	public static void main(String[] args) {

		
		CPU cpu = new CPU();
		cpu.Push(5);
		cpu.Push(4);
		cpu.Push(10);
		cpu.Push(9);
		cpu.Push(8);
		cpu.Store(1);
		System.out.println(cpu.toString());
		cpu.Load(1);
		System.out.println(cpu.toString());
		cpu.erase();
		System.out.println(cpu.toString());
		
		

		/**
		 * Engine eng = new Engine(); eng.start();
		 */

	}

}
