package main;
/**
 * Clase Main
 * 
 * @author elena
 */
public class Main {

	public static void main(String[] args) {
		Memory memory = new Memory();
		System.out.println(memory.toString());
		memory.write(0, 5);
		memory.write(1, 2);
		memory.write(2, 3);
		System.out.println(memory.toString());
		System.out.println(memory.read(1));
		memory.write(10, 4);
		System.out.println(memory.toString());
		memory.write(5, 1);
		System.out.println(memory.toString());

	}

}
