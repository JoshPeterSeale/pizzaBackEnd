package com.pizzaApp.pizzaBackEnd.menu.model.food;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.pizzaApp.pizzaBackEnd.menu.model.food.Ingredient;

import java.util.List;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="pizza")
public class Pizza {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    List<String> ingredients;
    float price;
    boolean glutenFree;
    boolean vegeterian;
    boolean vegan;

    public Pizza(String name, List<String> ingredients, float price, boolean glutenFree, boolean vegeterian, boolean vegan){
        this.name=name;
        this.ingredients=ingredients;
        this.price=price;
        this.glutenFree=glutenFree;
        this.vegeterian=vegeterian;
        this.vegan=vegan;
    }
}



