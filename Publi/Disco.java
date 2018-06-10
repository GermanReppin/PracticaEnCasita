package Publi;

public class Disco extends Publicacion {

	int duracion;
	
	public Disco(String nombre,float precio, int duracion) {
		super(nombre, precio);
		this.duracion = duracion;	
	}
	
	public Disco() {
		super();
		this.duracion = 0;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}
