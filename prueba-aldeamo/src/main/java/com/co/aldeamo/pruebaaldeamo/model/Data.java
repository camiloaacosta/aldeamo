package com.co.aldeamo.pruebaaldeamo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "arrays")
public class Data {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="input_array")
    private String inputArray;

	public Integer getId() {
		return id;
	}

	public String getInputArray() {
		return inputArray;
	}
}
