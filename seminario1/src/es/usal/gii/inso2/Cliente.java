package es.usal.gii.inso2;

import es.usal.gii.inso2.listeners.BarraProgreso1;
import es.usal.gii.inso2.listeners.BarraProgreso2;
import es.usal.gii.inso2.listeners.Listener;

public class Cliente {
	
	ManejadorDeServicio servidor;
	Listener barraProgreso; //Si declaras aquí una BarraProgreso1 te cargas el diagrama de clases, por eso el Listener
	
	public Cliente() {
		servidor = new ManejadorDeServicio();
		barraProgreso = new BarraProgreso1();
	}
	
	public void setListener(Listener _barraProgreso) {
		this.barraProgreso = _barraProgreso;
	}
	
	public void llamarServicio(int tamEnMegas) {
		servidor.ManejarServicio(tamEnMegas, barraProgreso);
	}
}
