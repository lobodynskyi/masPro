package com.masPro.masPro.service;

import com.masPro.masPro.model.Client;
import com.masPro.masPro.repository.ClientRepository;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public void save(Client client){
        clientRepository.save(client);
    }

    public List<Client> getAll(){
        return clientRepository.findAll();
    }

    public Optional<Client> findById(int id){
        return clientRepository.findClientById(id);
    }

}
