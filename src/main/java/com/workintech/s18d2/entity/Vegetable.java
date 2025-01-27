package com.workintech.s18d2.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vegetable")
public class Vegetable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;

    public void setGrownOnTree(boolean grownOnTree) {

        isGrownOnTree = grownOnTree;
    }
}
