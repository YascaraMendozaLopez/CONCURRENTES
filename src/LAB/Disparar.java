package LAB;

public class Disparar extends Thread {
	private Pistola pistola;
	
	public Disparar (Pistola pistola, String name) {
		super (name);
		this.pistola = pistola;
	}
	
	@Override
	public void run() {
		for (int i = 1; i < 16; i++) {
			try {
				pistola.disparar(Integer.toString(i), this.getName());
				System.out.println(this.getName() +"Dispara la bala: " + i);
				sleep(10);
			} catch (InterruptedException e) {}			
		}
	}

}
