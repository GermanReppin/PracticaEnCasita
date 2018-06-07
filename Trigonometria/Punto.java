package Trigonometria;

public class Punto {

	float x;
	float y;
	
	
	public Punto() {
		
		this.x = 0;
		this.y = 0;
	}
	
	public Punto(float a,float b) {
		
		this.x = a;
		this.y = b;	
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
	public void coordenadas() {
		
		System.out.println("X = " + x);
		System.out.println("y = " +  y);
	}
	public void sumarPuntos(Punto p2) {
		
		this.x += p2.getX();
		this.y += p2.getY();
		
	}
	
	public boolean iguales(Punto p2) {
		
		boolean Iguales = false;
			
		if (x == p2.getX()) {
			} if (y == p2.getY()) {
				Iguales = true;
			}
			
			return Iguales;
	}
	
}
