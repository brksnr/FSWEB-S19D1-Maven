package com.workintech.s18d2.controller;

import com.workintech.s18d2.dto.FruitResponse;
import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/fruit")
@Validated
public class FruitController {

    private final FruitService fruitService;

    @GetMapping("")
    public List<Fruit> getAllFruitsByPriceAsc() {
        return fruitService.getByPriceAsc();
    }

    @GetMapping("/desc")
    public List<Fruit> getAllFruitsByPriceDesc() {
        return fruitService.getByPriceDesc();
    }

    @GetMapping("/{id}")
    public FruitResponse getFruitById(
            @Positive(message = "ID sıfırdan küçük olamaz.")
            @PathVariable Long id) {
        Fruit fruit = fruitService.getById(id);
        return new FruitResponse("Fruit fetched successfully!", fruit);
    }

    @PostMapping
    public Fruit saveOrUpdateFruit(@RequestBody @Validated Fruit fruit) {
        return fruitService.save(fruit);
    }

    @GetMapping("/name/{name}")
    public List<Fruit> getFruitsByNameContaining(
            @Size(min = 2, max = 45, message = "name size must be between 2 to 45")
            @PathVariable("name") String name) {
        return fruitService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public Fruit deleteFruitById(
            @NotNull(message = "ID null olamaz.")
            @Positive(message = "ID sıfırdan küçük olamaz.")
            @PathVariable Long id) {
        return fruitService.delete(id);
    }
}
