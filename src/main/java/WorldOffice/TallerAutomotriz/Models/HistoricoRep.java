package WorldOffice.TallerAutomotriz.Models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class HistoricoRep {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombremecanico;
    @Basic
    private String cantreparaciones;
    @Basic
    private String cantrepuestos;
    @Basic
    private String ultimareparacion;
    @OneToOne(mappedBy = "historicoRep")
    private Vehiculo vehiculos;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombremecanico() {
		return nombremecanico;
	}
	public void setNombremecanico(String nombremecanico) {
		this.nombremecanico = nombremecanico;
	}
	public String getCantreparaciones() {
		return cantreparaciones;
	}
	public void setCantreparaciones(String cantreparaciones) {
		this.cantreparaciones = cantreparaciones;
	}
	public String getCantrepuestos() {
		return cantrepuestos;
	}
	public void setCantrepuestos(String cantrepuestos) {
		this.cantrepuestos = cantrepuestos;
	}
	public String getUltimareparacion() {
		return ultimareparacion;
	}
	public void setUltimareparacion(String ultimareparacion) {
		this.ultimareparacion = ultimareparacion;
	}
	public Vehiculo getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(Vehiculo vehiculos) {
		this.vehiculos = vehiculos;
	}
	public HistoricoRep(Long id, String nombremecanico, String cantreparaciones, String cantrepuestos,
			String ultimareparacion, Vehiculo vehiculos) {
		super();
		this.id = id;
		this.nombremecanico = nombremecanico;
		this.cantreparaciones = cantreparaciones;
		this.cantrepuestos = cantrepuestos;
		this.ultimareparacion = ultimareparacion;
		this.vehiculos = vehiculos;
	}
	public HistoricoRep() {
		super();
	}
	
   
}