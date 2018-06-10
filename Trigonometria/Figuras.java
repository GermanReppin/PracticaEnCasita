package Trigonometria;

public class Figuras {

	float lado1;
	float lado2;
	float lado3;
	float lado4;
	
	
	public Figuras(float AA, float ID) {
	
	if (AA > 0) {
		lado1 = AA;
		lado2 = AA;
		
		if (ID > 0) {
			lado3 = ID;
			lado4 = ID;
		} else {
			System.out.println("Valor invalido");
		}
	} else {
			System.out.println("Valor invalido");
			}		
	}
	
	
	public Figuras(float Todos) {
		
		if (Todos > 0) {
			lado1 = Todos;
			lado2 = Todos;
			lado3 = Todos;
			lado4 = Todos;
			} else {
				System.out.println("Valor invalido");
				}	
	}
	
	
	public Figuras() {
			lado1 = 0f;
			lado2 = 0f;
			lado3 = 0f;
			lado4 = 0f;
	}
	
	public void area() {
		
		float area = this.lado1 * this.lado3;
		System.out.println("El area de la figura es " + area);
	}
	
	
	
	public static void main(String[] args) {
		
		Rectangulo r = new Rectangulo(2.5f, 3.43f);
		Cuadrado c = new Cuadrado(2.5f);
		
		r.area();
		c.area();
		
	}
	
}
