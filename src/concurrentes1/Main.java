package concurrentes1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Canasta canasta = new Canasta (10);
		new Producir(canasta, "Productor 1 ").start();
		new Thread (new Consumir (canasta,"Consumidor 1 ")).start();
		new Thread (new Consumir (canasta,"Consumidor 2 ")).start();
	}

}
