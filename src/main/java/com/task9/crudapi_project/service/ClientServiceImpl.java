package com.task9.crudapi_project.service;

import com.task9.crudapi_project.exception.ResourceNotFoundException;
import com.task9.crudapi_project.mapper.ClientMapper;
import com.task9.crudapi_project.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientMapper clientMapper;

    public ClientServiceImpl(ClientMapper clientMapper) {
        this.clientMapper = clientMapper;
    }

    @Override
    public List<Client> findAll() {
        return clientMapper.findAll();
    }

    @Override
    public Client findById(int id) {
        Optional<Client> client = clientMapper.findById(id);
        return client.orElseThrow(() -> new ResourceNotFoundException("resource not found:" + id));
    }
}
