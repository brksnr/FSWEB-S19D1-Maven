package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fruit")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "fruit_type")
    @Enumerated(EnumType.STRING)
    private FruitType fruitType;
}
