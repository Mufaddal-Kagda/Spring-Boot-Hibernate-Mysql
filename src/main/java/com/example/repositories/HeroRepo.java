package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Herotable;
@Repository
public interface HeroRepo extends CrudRepository<Herotable,Integer>{

}
