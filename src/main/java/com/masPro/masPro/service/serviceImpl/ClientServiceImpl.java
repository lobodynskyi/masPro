package com.masPro.masPro.service.serviceImpl;

import com.masPro.masPro.model.Application;
import com.masPro.masPro.model.Client;
import com.masPro.masPro.repository.ClientRepository;
import com.masPro.masPro.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Transactional
    public void save(Client client){
        clientRepository.save(client);
    }

    public List<Client> getAll(){
        return clientRepository.findAll();
    }

    public Optional<Client> findById(int id){
        return clientRepository.findClientById(id);
    }

    public Optional<Client> findByEmail(String email) {return clientRepository.findByEmail(email); }

}
