package ar.edu.unlam.pb2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Vigilancia {

	private String nombre;
	private Set<Banco>bancos;
	private Set<Persona>atracadores;
	private Set<Atraco>atracos;

	public Vigilancia(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.bancos = new HashSet<>();
		this.atracadores = new TreeSet<>();
		this.atracos = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Banco> getBancos() {
		return bancos;
	}

	public void setBancos(Set<Banco> bancos) {
		this.bancos = bancos;
	}

	public void agregarBanco(Banco banco) throws YaExisteBanco {
		// TODO Auto-generated method stub
		if(this.bancos.contains(banco)) {
			throw new YaExisteBanco();
		}
		else {
		this.bancos.add(banco);
		}
	}

	public Integer cantidadDeBancos() {
		// TODO Auto-generated method stub
		return bancos.size();
	}

	public void registrarPersona(Persona persona) throws PersonaDuplicadaException {
		// TODO Auto-generated method stub
		
		if(atracadores.contains(persona)) {
			throw new PersonaDuplicadaException();
		}
		else {
			this.atracadores.add(persona);
		}
	}
	
	public Integer obtenerCantidadAtracadores() {
		// TODO Auto-generated method stub
		Integer i = 0;
		for (Persona persona : atracadores) {
			if(persona instanceof Atracador) {
				i++;
			}
		}
		return i;
	}

	public Set<Persona> getAtracadores() {
		return atracadores;
	}

	public void setAtracadores(Set<Persona> atracadores) {
		this.atracadores = atracadores;
	}

	public void registrarAtraco(Integer dni, Integer idBanco) {
		// TODO Auto-generated method stub
		Persona atracadores = buscarPersonaPorDni(dni);
		Banco banco = buscarBancoPorId(idBanco);
		Integer cantidadDeAtracos = atracos.size();
		cantidadDeAtracos++;
		Atraco atraco = new Atraco(cantidadDeAtracos);
		if(atracadores!= null && banco!= null) {
		atraco.agregarAtracadores((Atracador) atracadores);
		atraco.setBanco(banco);
		this.atracos.add(atraco);
		}
	}

	public Atraco buscarAtracoPorClave(Integer claveAtraco) {
		// TODO Auto-generated method stub
		for (Atraco a : atracos) {
			if(a.getClaveAtraco().equals(claveAtraco)) {
				return a;
			}
		}
		return null;
	}
	
	public Banco buscarBancoPorId(Integer idBanco) {
		for (Banco b : bancos) {
			if(b.getIdBanco().equals(idBanco)) {
				return b;
			}
		}
		return null;
	}

	public Persona buscarPersonaPorDni(Integer dni) {
		for (Persona p : atracadores) {
			if(p.getDni().equals(dni)) {
				return p;
			}
		}
		return null;
	}
	
	public TreeSet<Atracador> obtenerAtracadoresOrdenados(Comparator<Atracador> comparador) {
        TreeSet<Atracador> atracadoresOrdenados = new TreeSet<>(comparador);
        for (Persona persona : atracadores) {
            if (persona instanceof Atracador) {
                atracadoresOrdenados.add((Atracador) persona);
            }
        }
        return atracadoresOrdenados;
    }

	public Vigilante obtenerElVigiladorDeUnAtraco(Integer claveAtraco) throws ClaveInexistenteException, VigilanteNoEncontradoException {
		Atraco atraco = buscarAtracoPorClave(claveAtraco);
		Banco banco = atraco.getBanco();
		Vigilante vigilante = buscarVigilantePorBanco(banco);

		return vigilante;

	}
	
	private Vigilante buscarVigilantePorBanco(Banco banco) throws VigilanteNoEncontradoException {
		for (Persona vigilante : atracadores) {
			if (vigilante instanceof Vigilante && ((Vigilante) vigilante).getBanco().equals(banco)) {
				return (Vigilante) vigilante;
			}
		}
		throw new VigilanteNoEncontradoException();
	}


	
	
	

}
