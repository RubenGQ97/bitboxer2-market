package com.bitboxer2.Bitboxer2market.Persistence.Entity;

import java.util.Set;

/**
 * @hibernate.class
 *  table="USUARIO"
 *  mutable="true"
 *  dynamic-update="true"
 */
public class Usuario{


    private Integer idUsuario;
    private String nombre;
    private String contrasenia;
    private Set<Articulo> articulosCreados;


    /**
     * @hibernate.id unsaved-value="null" column="idUsuario"
     * @hibernate.generator class="sequence"
     * @hibernate.param name="sequence" value="usuario_id_seq"
     */
	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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
    * @hibernate.property column="contrasenia" type="string" not-null="true" unique="false"
    */
	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


    /**
     * @hibernate.set cascade="all.delete-orphan" lazy="true" inverse="false"
     * @hibernate.key column="idUsuario"
     * @hibernate.one-to-many class="com.bitboxer2.Bitboxer2market.Persistence.Entity.Articulo"
     */
	public Set<Articulo> getArticulosCreados() {
		return this.articulosCreados;
	}

	public void setArticulosCreados(Set<Articulo> articulosCreados) {
		this.articulosCreados = articulosCreados;
	}

}