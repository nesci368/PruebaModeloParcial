package ar.edu.unlam.pb2;



public class Atracador extends Persona {
	
	private Integer dni;
	private String nombre;
	private String apellido;
	private String apodo;
	private Banda banda;

	public Atracador(Integer dni, String nombre, String apellido, String apodo, Banda banda) {
		super(dni, nombre, apellido);
		// TODO Auto-generated constructor stub
		this.apellido = apellido;
		this.apodo = apodo;
		this.dni = dni;
		this.nombre = nombre;
		this.setBanda(banda);
		
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}

	
	

}
