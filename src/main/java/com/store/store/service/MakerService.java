package com.store.store.service;

import java.util.List;

import com.store.store.model.entities.Maker;

public interface MakerService {
    List<Maker> getAllMakers();
    Maker getMakerById(int id);
    Maker createMaker(Maker maker);
    Maker updateMaker(int id, Maker updatedMaker);
    void deleteMaker(int id);
}
