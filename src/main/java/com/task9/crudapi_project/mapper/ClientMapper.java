package com.task9.crudapi_project.mapper;

import com.task9.crudapi_project.entity.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClientMapper {
    @Select("SELECT * FROM clients")
    List<Client> findAll();
}
