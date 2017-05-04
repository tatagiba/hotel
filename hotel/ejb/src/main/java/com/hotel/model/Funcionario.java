package com.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario {
	
	@GeneratedValue
	@Id
	@Column
	private int Idfuncionario;
	
	@Column
	private String Nome;
	
	@Column
	private String Tipo_Func;
	
	@Column
	private String Senha;
	
	@Column
	private int Ativo;
	

	public int getIdfuncionario() {
		return Idfuncionario;
	}

	public void setIdfuncionario(int idfuncionario) {
		Idfuncionario = idfuncionario;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTipo_Func() {
		return Tipo_Func;
	}

	public void setTipo_Func(String tipo_Func) {
		Tipo_Func = tipo_Func;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public int getAtivo() {
		return Ativo;
	}

	public void setAtivo(int ativo) {
		Ativo = ativo;
	}
	
	

}
