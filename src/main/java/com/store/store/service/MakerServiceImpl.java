package com.store.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.store.store.model.entities.Maker;
import com.store.store.repository.IMakerDao;

@Service
public class MakerServiceImpl implements MakerService {
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

    @Override
    public Maker createMaker(Maker maker) {
        return makerRepository.save(maker);
    }

    @Override
    public Maker updateMaker(int id, Maker updatedMaker) {
        Maker maker = makerRepository.findById(id).orElse(null);

        if (maker != null) {
            maker.setName(updatedMaker.getName());
            return makerRepository.save(maker);
        }

        return null;
    }

    @Override
    public void deleteMaker(int id) {
        makerRepository.deleteById(id);
    }
}
