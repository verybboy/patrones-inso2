package es.usal.gii.inso2.listeners;

//Esta clase es la interfaz

public interface Listener {
	public void onStart();
	public void onProgress(int tamRestante);
	public void onFinish(int code);
}
