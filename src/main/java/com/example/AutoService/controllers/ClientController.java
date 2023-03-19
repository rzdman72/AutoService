package com.example.AutoService.controllers;

import com.example.AutoService.entities.Client;
import com.example.AutoService.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) { this.clientService = clientService; }

    @GetMapping("/hello")
    public String helloPage(Model model) {;
        return "hello";
    }
    @GetMapping("/clients")
    public String clientPage(Model model) {
        List<Client> clientList = clientService.getAllClients();
        model.addAttribute( "clients", clientList);
        return "clients";
    }
}

