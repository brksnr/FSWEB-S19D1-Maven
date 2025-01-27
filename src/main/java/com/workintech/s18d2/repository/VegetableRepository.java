package com.workintech.s18d2.repository;

import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {

    List<Vegetable> getByPriceDesc();

    List<Vegetable> getByPriceAsc();

    List<Vegetable> findByNameContaining(String name);
}
