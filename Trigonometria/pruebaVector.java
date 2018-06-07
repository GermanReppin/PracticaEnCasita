package Trigonometria;

public class pruebaVector {

	public static void main (String[] agrs) {
	
	Vector v1 = new Vector(2.4f, 3.0f, 4f);
	Vector v2 = new Vector(2f, 24.36f, 5f);
	
	System.out.println("El vector 1 es ");
	v1.coordenadasVector();
	
	System.out.println("El vector 2 es ");
	v2.coordenadasVector();
	
	if (v1.vecIguales(v2)) {
		
		System.out.println("podemos decir que ambos vectores son iguales");

	} else {
		
		System.out.println("podemos decir que ambos vectores son distintos");
	
	}	
	
	System.out.println("La suma de ambos es = ");
	
	v1.sumarVectores(v2);
	
	v1.coordenadasVector();
	
	
	
	
	}
}
