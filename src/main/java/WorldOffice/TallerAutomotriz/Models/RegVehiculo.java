package WorldOffice.TallerAutomotriz.Models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class RegVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   @Basic
    private Boolean soat;
    @Basic
    private Boolean tecnactiva;
    @Basic
    private Long multaspendientes;
    @Basic
    private Boolean seguroact;


    @OneToOne(mappedBy = "regVehiculo")
    private Vehiculo vehiculo;


	public RegVehiculo() {
		
	}


	public RegVehiculo(Long id, Boolean soat, Boolean tecnactiva, Long multaspendientes, Boolean seguroact,
			Vehiculo vehiculo) {
		super();
		this.id = id;
		this.soat = soat;
		this.tecnactiva = tecnactiva;
		this.multaspendientes = multaspendientes;
		this.seguroact = seguroact;
		this.vehiculo = vehiculo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Boolean getSoat() {
		return soat;
	}


	public void setSoat(Boolean soat) {
		this.soat = soat;
	}


	public Boolean getTecnactiva() {
		return tecnactiva;
	}


	public void setTecnactiva(Boolean tecnactiva) {
		this.tecnactiva = tecnactiva;
	}


	public Long getMultaspendientes() {
		return multaspendientes;
	}


	public void setMultaspendientes(Long multaspendientes) {
		this.multaspendientes = multaspendientes;
	}


	public Boolean getSeguroact() {
		return seguroact;
	}


	public void setSeguroact(Boolean seguroact) {
		this.seguroact = seguroact;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
    
}