package com.task9.crudapi_project.controller;

import com.task9.crudapi_project.entity.Client;
import com.task9.crudapi_project.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping("clients")
    public List<Client> clients() {
        List<Client> clients = clientService.findAll();
        return clients;
    }

    @GetMapping("clients/{id}")
    public ClientResponse findById(@PathVariable("id") int id) {
        Client client = clientService.findById(id);
        return new ClientResponse(client);
    }
}
