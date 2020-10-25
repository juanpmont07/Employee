package com.proyect.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	private String id;
	private String name;
	private String lastname;
	private String phone;
	private String email;
	
	@Column(name = "id_boss")
	private String idBoss;


	public Employee(String id, String name, String lastname, String phone, String email, String idBoss) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.idBoss = idBoss;
	}


	public Employee() {
		super();
	}
	
	
	
}
