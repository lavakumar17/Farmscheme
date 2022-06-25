package com.example.demo.farm_scheme.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.farm_scheme.models.Roles;

@Repository
public interface RolesRepo extends CrudRepository<Roles, String> {

}
