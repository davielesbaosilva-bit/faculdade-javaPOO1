package Entidades;

import java.util.Objects;

public class Quarto {
	private Integer andar;
	private Integer numero;
	private String nome;
	private String email;
	
	public Quarto (Integer andar, Integer numero, String nome, String email) {
		this.andar = andar;
		this.numero = numero;
		this.nome = nome;
		this.email = email;
	}
	
	public Integer getAndar() {
		return andar;
	}

	public void setAndar(Integer andar) {
		this.andar = andar;
	}

	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Quarto & Andares [numero = " + this.numero + ", andar = " + this.andar + ", nome=" + this.nome + ", email=" + this.email + "]";
	}

}
