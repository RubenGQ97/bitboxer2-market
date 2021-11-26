package com.bitboxer2.Bitboxer2market.Persistence.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "usuario")
@DynamicUpdate
public class Usuario{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "idusuario")
    private Integer idUsuario;
	@Column(name = "nombre", unique = true)
    private String nombre;
	@Column(name = "contrasenia")
    private String contrasenia;

	@OneToMany(mappedBy = "creador")
	@JsonBackReference
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

	@SpringBootApplication
	public static class Bitboxer2MarketApplication {

		public static void main(String[] args) {

			SpringApplication.run(Bitboxer2MarketApplication.class, args);
		}

	}
}