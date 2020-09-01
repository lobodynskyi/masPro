package com.masPro.masPro.repository;

import com.masPro.masPro.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface  ClientRepository extends JpaRepository<Client,Integer> {
    Optional <Client> findClientById(int id);

    Optional<Client> findByEmail(String email);
}
