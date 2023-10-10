package com.task9.crudapi_project;

import com.task9.crudapi_project.entity.Client;

public class ClientResponse {
    private int id;
    private String name;
    private int age;
    private String working;

    public ClientResponse(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.age = client.getAge();
        this.working = client.getWorking();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }
}
