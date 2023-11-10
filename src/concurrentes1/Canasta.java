package concurrentes1;

public class Canasta {
	private String [] productos;
	private int indice;
	private boolean  lleno;
	
	public Canasta (int n) {
		productos= new String [n];
		indice = -1;
		lleno = false;
	}
	
	public synchronized void llenar(String producto, String hilo) { ///producir
		while (lleno) {
			try {
			    System.out.println(hilo + "esta bloqueado ....");
				wait();
			} catch (InterruptedException e) {}
			
		}
		productos[++indice]=producto;
		
		if(indice == productos.length-1) {
			lleno  =true;	
		}
		notifyAll();
	}
	
	
	public synchronized String vaciar(String producto, String hilo) {//consumir
		while (!lleno) {
			
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		if(indice == 0) {
			lleno = false;		
		}
		
		notifyAll();
		return productos[indice--];
	}

}
