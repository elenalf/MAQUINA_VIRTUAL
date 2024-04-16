package main;
/**
 * Clase Main
 * 
 * @author elena
 */
public class Main {

	public static void main(String[] args) {
		OperandStack obj1 = new OperandStack();
		obj1.push(5);
		obj1.push(4);
		obj1.push(10);
		obj1.push(3);
		obj1.push(7);
		System.out.println(obj1.toString());
		System.out.println("La cima de la pila es " + obj1.getCima());
		obj1.pop();
		System.out.println(obj1.toString());
		System.out.println("La cima de la pila es " + obj1.getCima());
	

	}

}
