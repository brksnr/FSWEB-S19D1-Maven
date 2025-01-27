package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/vegetable")
@Validated
public class VegetableController {

    private final VegetableService vegetableService;

    @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @GetMapping
    public List<Vegetable> getAllFruitsByPriceAsc() {
        return vegetableService.getAllVegetablesByPriceAsc();
    }

    @GetMapping("/{id}")
    public Vegetable getFruitById(@PathVariable Long id) {
        return vegetableService.getVegetablesById(id);
    }

    @GetMapping("/desc")
    public List<Vegetable> getAllFruitsByPriceDesc() {
        return vegetableService.getAllVegetablesByPriceDesc();
    }

    @PostMapping
    public Vegetable saveOrUpdateFruit(@RequestBody Vegetable vegetable) {
        return vegetableService.saveOrUpdateVegetable(vegetable);
    }

    @PostMapping("/{name}")
    public List<Vegetable> getFruitsByNameContaining(@PathVariable String name) {
        return vegetableService.getVegetablesByNameContaining(name);
    }

    @DeleteMapping("/{id}")
    public Vegetable deleteFruitById(@PathVariable Long id) {
        return vegetableService.delete(id);
    }
}
