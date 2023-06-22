package com.pizza.practika.services;

import com.pizza.practika.entities.Client;
import com.pizza.practika.exception.NullEntityReferenceException;

import java.util.List;

public interface ClientService {
    Client create (Client client) throws NullEntityReferenceException;
    Client readById (Long id);
    Client update (Client client);
    void delete (Long id);
    List<Client> getAll();

}