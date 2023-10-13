package com.task9.crudapi_project.controller;

import com.task9.crudapi_project.ClientResponse;
import com.task9.crudapi_project.ResourceNotFoundException;
import com.task9.crudapi_project.entity.Client;
import com.task9.crudapi_project.service.ClientService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

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


    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleNoResourceFound(
            ResourceNotFoundException e, HttpServletRequest request) {
        Map<String, String> body = Map.of(
                "timestamp", ZonedDateTime.now().toString(),
                "status", String.valueOf(HttpStatus.NOT_FOUND.value()),
                "error", HttpStatus.NOT_FOUND.getReasonPhrase(),
                "message", e.getMessage(),
                "path", request.getRequestURI());
        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }
}
