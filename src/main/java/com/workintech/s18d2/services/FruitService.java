package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import lombok.Data;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface FruitService {


    List<Fruit> getByPriceAsc();

    Fruit getById(Long id);

    List<Fruit> getByPriceDesc();

    Fruit save(Fruit fruit);

    List<Fruit> searchByName(String name);

    Fruit delete(Long id);


}
























 /*
        *
        * private final FruitRepository fruitRepository;

        @Autowired
     FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }


     List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

     Fruit getById(Long id) {
        return fruitRepository.findById(id).orElse(null);
    }

     List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }

     Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

     List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }

     boolean delete(Long id) {
        if (fruitRepository.existsById(id)) {
            fruitRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
        * */