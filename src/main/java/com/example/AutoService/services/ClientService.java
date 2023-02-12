package com.example.AutoService.services;

import com.example.AutoService.entities.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> getAllClients();

    Optional<Client> getClientById (long id);
}
