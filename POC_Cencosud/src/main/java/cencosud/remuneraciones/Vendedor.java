package cencosud.remuneraciones;

import java.io.Serializable;

public class Vendedor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8702687026690180197L;
	private int sueldo;
	private int comision;
	private int montoVenta;
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	public int getMontoVenta() {
		return montoVenta;
	}
	public void setMontoVenta(int montoVenta) {
		this.montoVenta = montoVenta;
	}
	
	

}
