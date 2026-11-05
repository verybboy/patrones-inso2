package es.usal.gii.inso2.main;

import java.util.Scanner;

import es.usal.gii.inso2.Cliente;
import es.usal.gii.inso2.listeners.BarraProgreso1;
import es.usal.gii.inso2.listeners.BarraProgreso2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		int opcion = -1;
		
		do {
			System.out.println("1. Barra de progreso 1");
			System.out.println("2. Barra de progreso 2");
			System.out.println("3. Salir");
			
			Scanner s = new Scanner(System.in);
			opcion = s.nextInt();
			
			if (opcion == 1) {
				c.setListener(new BarraProgreso1());
				c.llamarServicio(10);
			}
			else if (opcion == 2) {
				c.setListener(new BarraProgreso2());
				c.llamarServicio(10);
			}
		} while (opcion != 3);	
	}

}
