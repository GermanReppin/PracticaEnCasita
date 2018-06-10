package Hosp;

public abstract class Empleado extends Persona {

	int codigoEmpleado;
	int horasExtra;
	String companiaSeguro;
	
	public Empleado(String nombre, String direccion, String ciudad, int codigoe, int horase, String compania) {
		super(nombre, direccion, ciudad);
		this.codigoEmpleado = codigoe;
		this.horasExtra = horase;
		this.companiaSeguro = compania;
	}
	
	public Empleado() {
		super();
		this.codigoEmpleado = 0;
		this.horasExtra = 0;
		this.companiaSeguro = "";
	}
	
	public void enviarSalario() {
		
	}
}
