package com.pizza.practika.services.impl;


import com.pizza.practika.entities.Client;
import com.pizza.practika.exception.NullEntityReferenceException;
import com.pizza.practika.repository.ClientRepository;
import com.pizza.practika.services.ClientService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private ClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        if (client != null) {
            return clientRepository.save(client);
        }
        throw new NullEntityReferenceException("Client cannot be 'null'");
    }

    @Override
    public Client readById(Long id) {
        return clientRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Client with id " + id + " not found"));
    }

    @Override
    public Client update(Client client) {
        if(client != null){
            readById(client.getId());
            return clientRepository.save(client);
        }
        throw new NullEntityReferenceException("Client cannot be 'null'");
    }

    @Override
    public void delete(Long id) {
        Client client = readById(id);
        clientRepository.delete(client);

    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
