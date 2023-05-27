package com.store.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.store.model.entities.Maker;

public interface IMakerDao extends JpaRepository<Maker, Integer>{
    
}
