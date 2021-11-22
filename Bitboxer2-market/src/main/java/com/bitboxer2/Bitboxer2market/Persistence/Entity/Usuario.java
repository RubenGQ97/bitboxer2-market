package com.bitboxer2.Bitboxer2market.Persistence.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
    private Integer idUsuario;
	@Column(name = "nombre")
    private String nombre;
	@Column(name = "contrasenia")
    private String contrasenia;

	@OneToMany(mappedBy = "creador")
    private Set<Articulo> articulosCreados;


	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

    

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



	public Set<Articulo> getArticulosCreados() {
		return this.articulosCreados;
	}

	public void setArticulosCreados(Set<Articulo> articulosCreados) {
		this.articulosCreados = articulosCreados;
	}

}