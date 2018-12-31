package com.everis.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity
public class TerereModel {

	@Id
	private int id;
	private String name;
	private String dt_insercao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDt_insercao() {
		return dt_insercao;
	}

	public void setDt_insercao(String dt_insercao) {
		this.dt_insercao = dt_insercao;
	}

}
