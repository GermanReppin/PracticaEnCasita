package Emp;
import java.util.Scanner;

public class Planta {

	static int cont = 0;
	Empleado[] emp;
	Scanner aux = new Scanner(System.in);
	int num;

	
	
	public void inicializarPlanta() {
		
		System.out.println("Escriba la catidad de empleados");
		this.num = aux.nextInt();
		this.emp = new Empleado[num];
	}
	
	
	public void cargarPlanta() {
		
		String nom;
		
		while (cont < num){
			Empleado empleado = new Empleado();
			System.out.println("Escriba un nombre");
				
				nom = aux.next();
				empleado.setNomEmpleado(nom);
				
				System.out.println("Escriba un numero");
				
				int num2;
				num2 = aux.nextInt();
				empleado.setNumEmpleado(num2);
				
				this.emp[cont] = empleado;
				
				cont++;
			}
			
		}
	
	
	public void mostrarEmpleados() {
	
		Empleado empleado;
		int cant = 0;
		
		while (cant < num){
		
		empleado = emp[cant];
		
		empleado.datos();
		
		cant++;
	}
}

	
	
	
}
