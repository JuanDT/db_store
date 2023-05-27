package com.store.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.store.store.model.entities.Maker;
import com.store.store.repository.IMakerDao;

public class MakerServiceImpl implements MakerService{
    @Autowired
    private IMakerDao makerRepository;

    @Override
    public List<Maker> getAllMakers() {
        return makerRepository.findAll();
    }

    @Override
    public Maker getMakerById(int id) {
        return makerRepository.findById(id).orElse(null);
    }
}
