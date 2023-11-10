package concurrentes1;

public class Consumir implements Runnable{
	private Canasta canasta;
	private String name;
	
	public Consumir (Canasta canasta, String name) {
		this.canasta = canasta;
		this.name= name;
	}
	
	@Override
	public void run () {
		System.out.println(name + "inicia proceso ...");
		for (int i = 1; i < 100; i++) {
			try {
				canasta.vaciar(Integer.toString(i), name);
				System.out.println(name  + "consume producto: " + i);
				Thread.sleep(10);
			}catch(InterruptedException e) {}
		}
	}

}
