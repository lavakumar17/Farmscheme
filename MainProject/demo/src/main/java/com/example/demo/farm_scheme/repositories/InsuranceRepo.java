package com.example.demo.farm_scheme.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.farm_scheme.models.InsuranceReg;
@Repository
public interface InsuranceRepo extends CrudRepository<InsuranceReg, Integer> {

}
