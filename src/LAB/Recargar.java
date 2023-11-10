package LAB;

public class Recargar extends Thread{
	private Pistola pistola;
	
	public Recargar (Pistola pistola , String name) {
		super(name);
		this.pistola=pistola;
	}

	
	@Override
	public void run () {
		System.out.println(this.getName()+ " Inicia la recarga");
		for (int i =1 ; i < 16; i++) {
			try {
				pistola.cargar(Integer.toString(i), this.getName());
				System.out.println(this.getName() + " Carga la bala: "+ i);
				sleep(10);
			} catch (InterruptedException e) {}
		}
	}
}
