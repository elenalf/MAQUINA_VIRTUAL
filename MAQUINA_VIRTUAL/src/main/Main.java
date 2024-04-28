package main;
/**
 * Clase Main
 * 
 * @author elena
 */
public class Main {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		OperandStack pila = new OperandStack();
		Memory memoria = new Memory();
		pila.push(5);
		pila.push(2);
		pila.push(3);
		memoria.write(0, 2);
		memoria.write(1, 3);
		System.out.println(cpu.toString());

	}

}
