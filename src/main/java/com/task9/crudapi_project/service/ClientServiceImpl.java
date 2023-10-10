package com.task9.crudapi_project.service;

import com.task9.crudapi_project.mapper.ClientMapper;
import com.task9.crudapi_project.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
