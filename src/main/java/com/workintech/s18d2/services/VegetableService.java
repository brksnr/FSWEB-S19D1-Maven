package com.workintech.s18d2.services;


import com.workintech.s18d2.entity.Vegetable;
import lombok.Data;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VegetableService {


    List<Vegetable> getAllVegetablesByPriceAsc();

    Vegetable getVegetablesById(Long id);

    List<Vegetable> getAllVegetablesByPriceDesc();

    Vegetable saveOrUpdateVegetable(Vegetable vegetable);

    List<Vegetable> getVegetablesByNameContaining(String name);

    Vegetable delete(Long id);
}