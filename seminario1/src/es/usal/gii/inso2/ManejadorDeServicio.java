package es.usal.gii.inso2;

import java.util.Random;

import es.usal.gii.inso2.listeners.Listener;

public class ManejadorDeServicio {
	
	public void ManejarServicio (int tamEnMegas, Listener l) {
		
		Thread hilo = new Thread() {
			
			public void run() {
				
				l.onStart();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				for (int i=tamEnMegas;i>=0;i--) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					l.onProgress(i);
				}
				
				Random r = new Random();
				int resultado = r.nextInt(2);
				l.onFinish(resultado);
				
			}
		};
		
		hilo.start();
	}
}
