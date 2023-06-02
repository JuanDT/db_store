package com.store.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.store.model.entities.Maker;
import com.store.store.repository.IMakerDao;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class MakerController {
    @Autowired
    private IMakerDao makerRepository;
    
        
    @GetMapping("makers")
    public List<Maker> getAllMakers() {
        return makerRepository.findAll();
    }

     @PostMapping("makers")
     public Maker createMaker(@Valid @RequestBody Maker maker) {
         return makerRepository.save(maker);
     }

    @GetMapping("makers/{id}")
    public Maker getMakerById(@PathVariable int id) {
        return makerRepository.findById(id).orElse(null);
    }

    @PutMapping("makers/{id}")
    public Maker updateMaker(@PathVariable int id, @RequestBody Maker updatedMaker) {
        Maker maker = makerRepository.findById(id).orElse(null);

        if (maker != null) {
            maker.setName(updatedMaker.getName());
            return makerRepository.save(maker);
        }

        return null;
    }

    @DeleteMapping("makers/{id}")
    public void deleteMaker(@PathVariable int id) {
        makerRepository.deleteById(id);
    }
}
