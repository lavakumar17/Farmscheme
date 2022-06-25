package com.example.demo.farm_scheme.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.farm_scheme.models.SellRequest;

@Repository
public interface SellRequestRepo extends CrudRepository<SellRequest, Integer> {

}
