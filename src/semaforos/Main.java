package semaforos;

import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {		
		Semaphore semaforo = new Semaphore(3);
		for (int i = 1 ; i < 11; i++) {
			new Semaforo(semaforo, "Semaforo " + Integer.toString(i)).start();
		}
	}
}