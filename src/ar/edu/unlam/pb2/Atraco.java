package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Atraco {
	
	private Integer claveAtraco;
	private Set<Atracador>atracadores;
	private Banco bancos;
	
	public Atraco(Integer claveAtraco) {
		this.claveAtraco = claveAtraco;
		this.atracadores = new HashSet<>();
		
	}

	public Integer getClaveAtraco() {
		return claveAtraco;
	}

	public void setClaveAtraco(Integer claveAtraco) {
		this.claveAtraco = claveAtraco;
	}

	public Set<Atracador> getAtracadores() {
		return atracadores;
	}

	public void setAtracadores(Set<Atracador> atracadores) {
		this.atracadores = atracadores;
	}
	
	public void agregarAtracadores(Atracador atracadores) {
		this.atracadores.add(atracadores);
	}

	public Banco getBanco() {
		return bancos;
	}

	public void setBanco(Banco bancos) {
		this.bancos = bancos;
	}

	

}
