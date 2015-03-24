package co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class itinerarioEntity {
	

    @Id
    @GeneratedValue(generator = "itinerario")
    private String nombe;
	private String descripcion;
	private String terminacion;
	private String acciones;
	private long id;
	public String getNombe() {
		return nombe;
	}
	public void setNombe(String nombe) {
		this.nombe = nombe;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTerminacion() {
		return terminacion;
	}
	public void setTerminacion(String terminacion) {
		this.terminacion = terminacion;
	}
	public String getAcciones() {
		return acciones;
	}
	public void setAcciones(String acciones) {
		this.acciones = acciones;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

    
}