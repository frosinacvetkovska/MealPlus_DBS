package com.example.mealplus_dbs.model;

import com.example.mealplus_dbs.model.enumerations.Category;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "meal")
@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meal_id")
    private Long mealId;

    @Column(name = "name", nullable = false)
    private String mealName;

    @Column(name = "description")
    private String mealDescription;

    @Column(name = "price", nullable = false)
    private Double mealPrice;

    @Column(name = "discount", nullable = false)
    private Double mealDiscount;

    @Column(name = "category", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Category mealCategory;

    @Column(name = "picture")
    private String mealPicture;

    public Meal(String mealName, String mealDescription, Double mealPrice, Double mealDiscount, Category mealCategory, String mealPicture) {
        this.mealName = mealName;
        this.mealDescription = mealDescription;
        this.mealPrice = mealPrice;
        this.mealDiscount = mealDiscount;
        this.mealCategory = mealCategory;
        this.mealPicture = mealPicture;
    }

    public Meal(Long mealId, String mealName, String mealDescription, Double mealPrice, Double mealDiscount, Category mealCategory, String mealPicture) {
        this.mealId = mealId;
        this.mealName = mealName;
        this.mealDescription = mealDescription;
        this.mealPrice = mealPrice;
        this.mealDiscount = mealDiscount;
        this.mealCategory = mealCategory;
        this.mealPicture = mealPicture;
    }

    public Meal() {
    }

}
