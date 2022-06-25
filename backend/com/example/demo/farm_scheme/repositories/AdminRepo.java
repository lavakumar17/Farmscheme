package com.example.demo.farm_scheme.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.farm_scheme.models.Admin;
@Repository
public interface AdminRepo extends CrudRepository<Admin, String> {

}