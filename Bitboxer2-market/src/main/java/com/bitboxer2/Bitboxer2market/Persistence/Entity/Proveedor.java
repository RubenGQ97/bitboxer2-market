package com.bitboxer2.Bitboxer2market.Persistence.Entity;


import java.util.Set;

/**
 * @hibernate.class
 *  table="PROVEEDOR"
 *  mutable="true"
 *  dynamic-update="true"
 */
public class Proveedor{

    private Integer idProveedor;
    private String nombre;
    private String pais;
    private Set<Articulo> articulo;

    /**
     * @hibernate.id unsaved-value="null" column="idProveedor"
     * @hibernate.generator class="sequence"
     * @hibernate.param name="sequence" value="proveedor_id_seq"
     */
	public Integer getIdProveedor() {
		return this.idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}


    /** 
    * @hibernate.property column="nombre" type="string" not-null="true" unique="false"
    */
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /** 
    * @hibernate.property column="pais" type="string" not-null="true" unique="false"
    */
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}


    /**
     * @hibernate.set table="proveedor_articulo" cascade="none" lazy="true"
     * @hibernate.key column="idProveedor"
     * @hibernate.many-to-many class="com.bitboxer2.Bitboxer2market.Persistence.Entity.Articulo" column="idArticulo"
     */
	public Set<Articulo> getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Set<Articulo> articulo) {
		this.articulo = articulo;
	}


}