package com.algaworks.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.algaworks.crm.model.Cliente;

//Um componete da String como repository para interagir com BD
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
