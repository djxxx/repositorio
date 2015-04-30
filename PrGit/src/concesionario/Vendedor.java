package concesionario;

public class Vendedor {
	
	String nomVendedor;
	String apeVendedor;
	public String getNomVendedor() {
		return nomVendedor;
	}
	public void setNomVendedor(String nomVendedor) {
		this.nomVendedor = nomVendedor;
	}
	public String getApeVendedor() {
		return apeVendedor;
	}
	public void setApeVendedor(String apeVendedor) {
		this.apeVendedor = apeVendedor;
	}
	@Override
	public String toString() {
		return "Vendedor [nomVendedor=" + nomVendedor + ", apeVendedor="
				+ apeVendedor + "]";
	}
	

}
