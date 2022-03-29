package com.pack.bootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.bootjpa.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
