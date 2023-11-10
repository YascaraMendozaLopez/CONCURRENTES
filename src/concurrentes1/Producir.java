package concurrentes1;

public class Producir extends Thread {
	private Canasta canasta;
	
	public Producir (Canasta canasta, String name) {
		super (name);
		this.canasta = canasta;
	}
	
	
	@Override
	public void run () {
		System.out.println(this.getName() +  "inicia la produccion");
		for (int i = 1; i < 100; i++) {
			try { 
				canasta.llenar(Integer.toString(i), this.getName());
				System.out.println(this.getName()+" Produce producto: " + i);
				sleep(10);
			} catch (InterruptedException e) {}
		}
	}
}
