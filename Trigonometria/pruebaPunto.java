package Trigonometria;

public class pruebaPunto {

	public static void main (String[] args) {
	
		Punto p1 = new Punto(2.0f, 3.42f);     
		Punto p2 = new Punto(2.5f, 62.3f);
		
		System.out.println("El punto 1 es ");
		p1.coordenadas();
		
		System.out.println("El punto 2 es ");
		p2.coordenadas();
		
		if (p1.iguales(p2)) {
			
			System.out.println("podemos decir que ambos puntos son iguales");
	
		} else {
			
			System.out.println("podemos decir que ambos puntos son distintos");
		
		}	
		
		System.out.println("La suma de ambos es = ");
		
		
		p1.coordenadas();
	}	 
}
