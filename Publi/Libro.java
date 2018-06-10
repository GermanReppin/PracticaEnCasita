package Publi;

public class Libro extends Publicacion{

	int paginas;
	int a�o;
	
	public Libro(String titulo,float precio, int paginas, int a�o) {
		super(titulo, precio);
		this.paginas = paginas;
		this.a�o = a�o;	
	}
	
	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public Libro() {
		super();
		this.a�o = 0;
	}
}
