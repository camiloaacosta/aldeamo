package com.co.aldeamo.pruebaaldeamo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.co.aldeamo.pruebaaldeamo.service.DataService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
    DataService dataService;
	
	@GetMapping(value="/prueba")
	public String recibeDatos(
			@RequestParam("iteraciones") Integer itera,
			@RequestParam("arreglo") Integer id
			) {
			
		return dataService.getData(itera, id);
	}
}