package WorldOffice.TallerAutomotriz.Models.Dto;




public class RegVehiculoDto {

  
    private Long id;
    private Boolean soatactivo;
    private Boolean tecnactiva;
    private Long multaspendientes;
    private Boolean seguroact;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getSoatactivo() {
		return soatactivo;
	}
	public void setSoatactivo(Boolean soatactivo) {
		this.soatactivo = soatactivo;
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




    
}