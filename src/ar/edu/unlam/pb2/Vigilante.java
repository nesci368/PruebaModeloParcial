package ar.edu.unlam.pb2;

public class Vigilante extends Persona {
	
	private Integer dni;
	private String nombre;
	private String apellido;
	private Banco banco;

	public Vigilante(Integer dni, String nombre, String apellido, Banco banco) {
		super(dni, nombre, apellido);
		// TODO Auto-generated constructor stub
		this.apellido = apellido;
		this.banco = banco;
		this.dni = dni;
		this.nombre = nombre;
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

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	

}
