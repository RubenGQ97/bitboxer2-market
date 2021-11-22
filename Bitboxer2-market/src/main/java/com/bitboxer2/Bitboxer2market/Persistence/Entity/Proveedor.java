package com.bitboxer2.Bitboxer2market.Persistence.Entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "proveedor")
public class Proveedor{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProveedor")
    private Integer idProveedor;

	@Column(name = "nombre")
    private String nombre;
    @Column(name = "pais")
	private String pais;

	@ManyToMany
	@JoinTable(
			name = "proveedor_articulo",
			joinColumns = @JoinColumn(name = "idProveedor"),
			inverseJoinColumns = @JoinColumn(name = "idArticulo"))
    private Set<Articulo> articulo;


	public Integer getIdProveedor() {
		return this.idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}



	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}



	public Set<Articulo> getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Set<Articulo> articulo) {
		this.articulo = articulo;
	}


}