package com.ems.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cities")
public class Cities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cty_id", nullable = false, unique=true)
	private long id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="states_city", joinColumns=@JoinColumn(name="cty_id"), inverseJoinColumns=@JoinColumn(name="state_id"))
	private Cities cities;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cities getCities() {
		return cities;
	}

	public void setCities(Cities cities) {
		this.cities = cities;
	}
	
}
