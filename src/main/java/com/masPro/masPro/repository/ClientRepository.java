package com.masPro.masPro.repository;

import com.masPro.masPro.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface  ClientRepository extends JpaRepository<Client,Integer> {
    Optional <Client> findClientById(int id);
}
