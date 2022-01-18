package WorldOffice.TallerAutomotriz.Models;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Cliente {

	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;   
    @Basic
    private String nombre;
    @Basic
    private String apellido;
    @Basic
    private Long cedula;
    @Basic
    private Long edad;
    @Basic
    private Integer telefono;  
    @Basic
    private String  fecharegisto;
 
  @OneToMany(mappedBy = "cliente")
  private List<Vehiculo> vehiculos;

public Long getId() {
	return id;
}

public Cliente() {
	super();
}

public Cliente(Long id, String nombre, String apellido, Long cedula, Long edad, Integer telefono, String fecharegisto,
		List<Vehiculo> vehiculos) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.cedula = cedula;
	this.edad = edad;
	this.telefono = telefono;
	this.fecharegisto = fecharegisto;
	this.vehiculos = vehiculos;
}

public void setId(Long id) {
	this.id = id;
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

public Long getCedula() {
	return cedula;
}

public void setCedula(Long cedula) {
	this.cedula = cedula;
}

public Long getEdad() {
	return edad;
}

public void setEdad(Long edad) {
	this.edad = edad;
}

public Integer getTelefono() {
	return telefono;
}

public void setTelefono(Integer telefono) {
	this.telefono = telefono;
}

public String getFecharegisto() {
	return fecharegisto;
}

public void setFecharegisto(String fecharegisto) {
	this.fecharegisto = fecharegisto;
}

public List<Vehiculo> getVehiculos() {
	return vehiculos;
}

public void setVehiculos(List<Vehiculo> vehiculos) {
	this.vehiculos = vehiculos;
}
  
  
}
