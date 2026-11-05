package es.usal.gii.inso2.listeners;

//Esta clase es la interfaz por eso es "public interface"

public interface Listener {
	public void onStart();
	public void onProgress(int tamRestante);
	public void onFinish(int code);
}
