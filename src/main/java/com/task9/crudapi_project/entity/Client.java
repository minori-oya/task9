package com.task9.crudapi_project.entity;

public class Client {
    private int id;
    private String name;
    private int age;
    private String working;

    public Client(int id, String name, int age, String working) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.working = working;
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
