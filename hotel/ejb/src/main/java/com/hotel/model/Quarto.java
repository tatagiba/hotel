package com.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quarto {
	@Column
	@Id
	private int Numero_Quarto;
	@Column
	private int Andar;
	@Column
	private double Valor_Diaria;
	@Column
	private String Status;
	@Column
	private int capacidade;
	
	
	public int getNumero_Quarto() {
		return Numero_Quarto;
	}
	public void setNumero_Quarto(int numero_Quarto) {
		Numero_Quarto = numero_Quarto;
	}
	public int getAndar() {
		return Andar;
	}
	public void setAndar(int andar) {
		Andar = andar;
	}
	public double getValor_Diaria() {
		return Valor_Diaria;
	}
	public void setValor_Diaria(double valor_Diaria) {
		Valor_Diaria = valor_Diaria;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	

}
