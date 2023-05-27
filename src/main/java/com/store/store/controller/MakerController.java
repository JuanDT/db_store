package com.store.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.store.model.entities.Maker;
import com.store.store.repository.IMakerDao;

@RestController
@RequestMapping("/api/makers")
public class MakerController {
    @Autowired
    private IMakerDao makerRepository;
    
        
    @GetMapping("/")
    public List<Maker> getAllMakers() {
        return makerRepository.findAll();
    }
    

    @GetMapping("/find/{id}")
    public Maker getMakerById(@PathVariable int id) {
        return makerRepository.findById(id).orElse(null);
    }
    
}
