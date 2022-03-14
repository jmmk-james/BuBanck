package bu.banck.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuenta {
	
	@Id
	private long id; // colocar la propiedad de AUTO_INCREMENT de forma Manual 
	
	@Column
	private long id_cliente;
	
	@Column
	private String Tipo;
	
	@Column
	private long n_cuenta;
	
	@Column
	private String moneda;
	
	@Column
	private double monto;
	
	@Column
	private String fecha;
	
	@Column
	private String sucursal;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public long getN_cuenta() {
		return n_cuenta;
	}

	public void setN_cuenta(long n_cuenta) {
		this.n_cuenta = n_cuenta;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}	

}
