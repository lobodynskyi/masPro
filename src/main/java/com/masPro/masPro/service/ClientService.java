package com.masPro.masPro.service;

import com.masPro.masPro.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ClientService {
    public void save(Client client);

    public List<Client> getAll();

    public Optional<Client> findById(int id);

    public Optional<Client> findByEmail(String email) ;
}
