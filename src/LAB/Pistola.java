package LAB;

public class Pistola {
	private String[] balas;
	private int indice;
	private boolean cargada;
	
	public Pistola(int n) {
		balas = new String [n];
		indice = -1;
		cargada = false;
		
	}
	
	public synchronized void cargar(String bala, String hilo) {
		while (cargada) {
			try {
			    wait();
			} catch (InterruptedException e) {}
			
		}
		balas[++indice]=bala;
		
		if(indice == balas.length-1) {
			cargada  =true;	
		}
		notifyAll();
	}
	
	public synchronized String disparar(String bala, String hilo) {
		while (!cargada) {
			
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		if(indice == 0) {
			cargada = false;
			System.out.println("entra dispara");
		}
		
		notifyAll();
		
		return balas[indice--];
	}
	

}
