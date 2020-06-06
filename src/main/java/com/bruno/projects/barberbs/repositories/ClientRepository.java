package com.bruno.projects.barberbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruno.projects.barberbs.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
