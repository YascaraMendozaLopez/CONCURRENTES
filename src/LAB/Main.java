package LAB;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pistola pistola = new Pistola (15);
		new Recargar(pistola, "Carga 1 ").start();
		new Disparar(pistola, "Dispara 1 ").start();
		
		Pistola pistola2 = new Pistola (15);
		new Recargar(pistola2, "Carga 1.2 ").start();
		new Disparar(pistola2, "Dispara 1.2 ").start();
		
	}

}
