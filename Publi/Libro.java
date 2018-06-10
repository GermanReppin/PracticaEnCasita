package Publi;

public class Libro extends Publicacion{

	int paginas;
	int año;
	
	public Libro(String titulo,float precio, int paginas, int año) {
		super(titulo, precio);
		this.paginas = paginas;
		this.año = año;	
	}
	
	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Libro() {
		super();
		this.año = 0;
	}
}
