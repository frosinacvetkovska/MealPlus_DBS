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
    private float mealPrice;

    @Column(name = "discount", nullable = false)
    private float mealDiscount;

    @Column(name = "category", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Category mealCategory;

    @Column(name = "picture")
    private String mealPicture;

    public Meal(String mealName, String mealDescription, float mealPrice, float mealDiscount, Category mealCategory, String mealPicture) {
        this.mealName = mealName;
        this.mealDescription = mealDescription;
        this.mealPrice = mealPrice;
        this.mealDiscount = mealDiscount;
        this.mealCategory = mealCategory;
        this.mealPicture = mealPicture;
    }

    public Meal(Long mealId, String mealName, String mealDescription, float mealPrice, float mealDiscount, Category mealCategory, String mealPicture) {
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

    public Long getMealId() {
        return mealId;
    }

    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public float getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(float mealPrice) {
        this.mealPrice = mealPrice;
    }

    public float getMealDiscount() {
        return mealDiscount;
    }

    public void setMealDiscount(float mealDiscount) {
        this.mealDiscount = mealDiscount;
    }

    public Category getMealCategory() {
        return mealCategory;
    }

    public void setMealCategory(Category mealCategory) {
        this.mealCategory = mealCategory;
    }

    public String getMealPicture() {
        return mealPicture;
    }

    public void setMealPicture(String mealPicture) {
        this.mealPicture = mealPicture;
    }
}
