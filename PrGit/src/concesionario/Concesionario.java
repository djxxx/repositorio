package concesionario;

public class Concesionario {
	
	//Comentario nuevo en clase <<Concesionario>>”.

	public String getNomConcesionario() {
		return nomConcesionario;
	}
	
	public void setNomConcesionario(String nomConcesionario) {
		this.nomConcesionario = nomConcesionario;
	}
	public String getDirecConcesionario() {
		return direcConcesionario;
	}
	public void setDirecConcesionario(String direcConcesionario) {
		this.direcConcesionario = direcConcesionario;
	}
	String nomConcesionario;
    String direcConcesionario;
    
    @Override
	public String toString() {
		return "Concesionario [nomConcesionario=" + nomConcesionario
				+ ", direcConcesionario=" + direcConcesionario + "]";
	}
	
}
