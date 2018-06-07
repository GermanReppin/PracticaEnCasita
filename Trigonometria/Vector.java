package Trigonometria;

public class Vector extends Punto {

	float z;
	
	public Vector(float a, float b, float c) {
		
		super(a, b);
		this.z = c;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public void coordenadasVector() {
		
		System.out.println("X = " + x);
		System.out.println("y = " +  y);
		System.out.println("z = " + z);
	}

	public void sumarVectores(Vector v2) {
		
		this.x += v2.getX(); 
		this.y += v2.getY();
		this.z += v2.getZ();
		
	}
	
	public boolean vecIguales(Vector v2) {
		
		boolean Iguales = false;
			if (x == v2.getX()) {
				if (y == v2.getY()) {
					if (z == v2.getZ()) {
						Iguales = true;
					}
				}
			}
				return Iguales;
	}
}
