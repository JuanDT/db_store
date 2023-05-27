package com.store.store.service;

import java.util.List;

import com.store.store.model.entities.Maker;

public interface MakerService {
    List<Maker> getAllMakers();
    Maker getMakerById(int id);
}
