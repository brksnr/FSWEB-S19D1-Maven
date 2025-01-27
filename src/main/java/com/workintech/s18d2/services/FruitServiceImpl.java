package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.FruitType;
import com.workintech.s18d2.repository.FruitRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {


    private final FruitRepository fruitRepository;


    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Fruit delete(Long id) {
        Fruit fruit = getById(id);
        fruitRepository.delete(fruit);
        return fruit;
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }

    @Override
    public Fruit getById(Long id) {
        return fruitRepository.getById(id);
    }

    @Override
    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
