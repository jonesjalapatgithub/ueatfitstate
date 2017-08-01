package com.ueatfit.states.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.ueatfit.states.model.States;

@RestResource(path="statesdet")
public interface StatesDao extends JpaRepository<States, Long>{

	List<States> findByStateCode(int stateId);

	List<States> findAll();
   
}
