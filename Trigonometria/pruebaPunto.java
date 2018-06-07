package Trigonometria;

public class pruebaPunto {

	public static void main (String[] args) {
	
		Punto p1 = new Punto(2.0f, 3.42f);     
		Punto p2 = new Punto(2.0f, 3.42f);
		
		p1.coordenadas();
		
		System.out.println("Su suma con el punto2 es= ");
		
		p1.sumarPuntos(p2);
		
		p1.coordenadas();
	
		if (p1.iguales(p2)) {
			
			System.out.println("podemos decir que ambos vectores son iguales");
	
		} else {
			System.out.println("podemos decir que ambos vectores son distintos");
		
		}				
	}	 
}
