/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Problem1;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of calzado.
 * 
 * @author Oliver
 */
public class calzado {
	public calzado(int clave, String material, String troquel, int cantProdxDia, String colores) {
		super();
		this.clave = clave;
		this.material = material;
		this.troquel = troquel;
		this.cantProdxDia = cantProdxDia;
		this.colores = colores;
	}

	/**
	 * Description of the property clave.
	 */
	private int clave = 0;

	/**
	 * Description of the property material.
	 */
	private String material = "";

	/**
	 * Description of the property troquel.
	 */
	private String troquel = "";

	/**
	 * Description of the property cantProdxDia.
	 */
	private int cantProdxDia = 0;

	/**
	 * Description of the property colores.
	 */
	private String colores = "";

	// Start of user code (user defined attributes for calzado)

	// End of user code

	/**
	 * The constructor.
	 */
	public calzado() {
		// Start of user code constructor for calzado)
		super();
		// End of user code
	}

	/**
	 * Description of the method costoxLote.
	 * @param costoxUnida 
	 */
	public void costoxLote(float costoxUnida) {
		// Start of user code for method costoxLote
		// End of user code
	}

	// Start of user code (user defined methods for calzado)

	// End of user code
	/**
	 * Returns clave.
	 * @return clave 
	 */
	public int getClave() {
		return this.clave;
	}

	/**
	 * Sets a value to attribute clave. 
	 * @param newClave 
	 */
	public void setClave(int newClave) {
		this.clave = newClave;
	}

	/**
	 * Returns material.
	 * @return material 
	 */
	public String getMaterial() {
		return this.material;
	}

	/**
	 * Sets a value to attribute material. 
	 * @param newMaterial 
	 */
	public void setMaterial(String newMaterial) {
		this.material = newMaterial;
	}

	/**
	 * Returns troquel.
	 * @return troquel 
	 */
	public String getTroquel() {
		return this.troquel;
	}

	/**
	 * Sets a value to attribute troquel. 
	 * @param newTroquel 
	 */
	public void setTroquel(String newTroquel) {
		this.troquel = newTroquel;
	}

	/**
	 * Returns cantProdxDia.
	 * @return cantProdxDia 
	 */
	public int getCantProdxDia() {
		return this.cantProdxDia;
	}

	/**
	 * Sets a value to attribute cantProdxDia. 
	 * @param newCantProdxDia 
	 */
	public void setCantProdxDia(int newCantProdxDia) {
		this.cantProdxDia = newCantProdxDia;
	}

	/**
	 * Returns colores.
	 * @return colores 
	 */
	public String getColores() {
		return this.colores;
	}

	/**
	 * Sets a value to attribute colores. 
	 * @param newColores 
	 */
	public void setColores(String newColores) {
		this.colores = newColores;
	}

	@Override
	public String toString() {
		return "calzado [clave=" + clave + ", material=" + material + ", troquel=" + troquel + ", cantProdxDia="
				+ cantProdxDia + ", colores=" + colores + "]";
	}

}
