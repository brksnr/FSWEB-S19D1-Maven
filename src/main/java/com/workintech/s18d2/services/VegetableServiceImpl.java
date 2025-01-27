package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.repository.VegetableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableServiceImpl implements VegetableService {

    private final VegetableRepository vegetableRepository;

    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public List<Vegetable> getAllVegetablesByPriceAsc() {
        return List.of();
    }

    @Override
    public Vegetable getVegetablesById(Long id) {
        return null;
    }

    @Override
    public List<Vegetable> getAllVegetablesByPriceDesc() {
        return List.of();
    }

    @Override
    public Vegetable saveOrUpdateVegetable(Vegetable vegetable) {
        return null;
    }

    @Override
    public List<Vegetable> getVegetablesByNameContaining(String name) {
        return List.of();
    }

    @Override
    public Vegetable delete(Long id) {
        return null;
    }
}
