/*package com.ems.model;
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
@Table(name="states")
public class States {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable = false, unique=true)
	private long id;
	
	@Column(name="name", nullable = false, unique=true)
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="countries_states", joinColumns=@JoinColumn(name="id"), inverseJoinColumns=@JoinColumn(name="id"))
	Countries country;

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

	public Countries getCountry() {
		return country;
	}

	public void setCountry(Countries country) {
		this.country = country;
	}
	
	
}
*/