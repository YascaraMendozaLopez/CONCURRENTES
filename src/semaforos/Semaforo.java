package semaforos;

import java.util.concurrent.Semaphore;

public class Semaforo extends Thread{
	
	private Semaphore semaforo;
	
	public Semaforo(Semaphore semaforo, String name) {
		super (name);
		this.semaforo = semaforo;
	}
	
	@Override
	public void run () {
		System.out.println(this.getName()+ " Inicia proceso");
		try {
			semaforo.acquire();
			//aqui poner zona critica
			System.out.println(" Esta en zona critica" + this.getName());
			
			for (int i = 1; i < 11; i++) {
				System.out.println(i + "---> "+ this.getName());
				sleep(10);
			}
			
			System.out.println(this.getName() + " Termina el proceso");
			
		} catch (InterruptedException e){
			System.out.println("Salida por ejecucion inadecuada");
		}
		finally {
			semaforo.release();
		}
	}

}
