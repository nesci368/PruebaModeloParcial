package ar.edu.unlam.pb2;

import java.util.Objects;

public class Banco {

	private Integer idBanco;
	private String nombre;

	public Banco(Integer idbanco, String nombre) {
		// TODO Auto-generated constructor stub
		this.idBanco = idbanco;
		this.nombre = nombre;
	}

	public Integer getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(Integer idBanco) {
		this.idBanco = idBanco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idBanco, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		return Objects.equals(idBanco, other.idBanco) && Objects.equals(nombre, other.nombre);
	}
	
	

}
