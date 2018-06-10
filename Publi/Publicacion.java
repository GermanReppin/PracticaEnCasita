package Publi;

public abstract class Publicacion {

	protected String titulo;
	protected float precio;
	
	
	public Publicacion() {
		this.titulo = "";
		this.precio = 0;
		
	}
	
	public Publicacion(String t, float p) {
		this.titulo = t;
		this.precio = p;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public static void main(String[] agrs) {
		
		Libro libro = new Libro("caperucita roja", 119.99f, 200, 1978);
		Disco disco = new Disco("ten", 219.99f, 58);
		
		System.out.println("El libro " + libro.getTitulo() + " tiene un precio de " + libro.getPrecio() + "$ tiene " + libro.getPaginas() + " paginas y fue publicado en " + libro.getAño() + ".");
		System.out.println("El disco " + disco.getTitulo() + " tiene un precio de " + disco.getPrecio() + "$ y dura " + disco.getDuracion() + " minutos.");
		
	}
}

	
