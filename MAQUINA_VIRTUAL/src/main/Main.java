package main;

/**
 * Clase Main
 * 
 * @author elena
 */
public class Main {

	public static void main(String[] args) {

		
		OperandStack pila = new OperandStack();
		Memory memoria = new Memory();
		pila.push(5);
		pila.push(2);
		pila.push(3);
		memoria.write(0, 2);
		memoria.write(1, 3);
		CPU cpu = new CPU();
		System.out.println(cpu.toString());
		cpu.toString();

		/**
		 * Engine eng = new Engine(); eng.start();
		 */

	}

}
