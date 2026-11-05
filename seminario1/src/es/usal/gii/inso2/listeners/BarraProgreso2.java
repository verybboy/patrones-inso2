package es.usal.gii.inso2.listeners;

public class BarraProgreso2 implements Listener {

	@Override
	public void onStart() {
		System.out.println("[BARRAPROGRESO2] El servidor ha recibido la petición");
	}

	@Override
	public void onProgress(int tamRestante) {
		if ((tamRestante % 5) == 0) {
			System.out.println("[BARRAPROGRESO2] Quedan " + tamRestante + " MB");
		}
	}

	@Override
	public void onFinish(int code) {
		System.out.println("[BARRAPROGRESO2] Ha finalizado con código " + code);
	}

}
