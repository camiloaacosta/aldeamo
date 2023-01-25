package com.co.aldeamo.pruebaaldeamo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.co.aldeamo.pruebaaldeamo.model.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Integer>{

}
