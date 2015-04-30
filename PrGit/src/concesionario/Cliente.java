package concesionario;

public class Cliente {
	
	////Comentario nuevo en clase <<Cliente>>”.
	
	String idCliente;
	String nomCliente;
	String apeCliente;
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	public String getApeCliente() {
		return apeCliente;
	}
	public void setApeCliente(String apeCliente) {
		this.apeCliente = apeCliente;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomCliente=" + nomCliente
				+ ", apeCliente=" + apeCliente + "]";
	}
	
	


}
