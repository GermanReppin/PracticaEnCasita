package Practica;
import java.util.Scanner;

	public class Empleado {

		
		int numEmpleado;
		String nomEmpleado;
		Scanner aux = new Scanner(System.in);
		
		
			public int getNumEmpleado() {
				return numEmpleado;
			}
			
			
			public void setNumEmpleado(int numEmpleado) {
				this.numEmpleado = numEmpleado;
			}
			
			
			public String getNomEmpleado() {
				return nomEmpleado;
			}
			
			
			public void setNomEmpleado(String nomEmpleado) {
				this.nomEmpleado = nomEmpleado;
			}
		
			public void datos() {
				System.out.println("El nombre del empleado es " + this.getNomEmpleado());
				System.out.println("El numero del empleado es " + this.getNumEmpleado());
			}
				
			
			
	}
	
	
	

