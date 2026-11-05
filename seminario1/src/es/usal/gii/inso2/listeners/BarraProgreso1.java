package es.usal.gii.inso2.listeners;

public class BarraProgreso1 implements Listener {

	@Override
	public void onStart() {
		System.out.println("[BARRAPROGRESO1] El servidor ha recibido la petición");
	}

	@Override
	public void onProgress(int tamRestante) {
		System.out.println("[BARRAPROGRESO1] Quedan " + tamRestante + " MB");
	}

	@Override
	public void onFinish(int code) {
		System.out.println("[BARRAPROGRESO1] Ha finalizado con código " + code);
	}

}
