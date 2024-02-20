package com.example.mealplus_dbs.model.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.util.Date;

@Data
@Entity
@Immutable
@Table(name = "order_list")
@NoArgsConstructor
@AllArgsConstructor
public class OrderList {
    @Id
    private Long orderId;
    private Date dateOfOrder;
    private String orderNumber;
    private Date deliveryTime;
    private Integer mealId;
    private String mealName;
    private Double price;
    private Integer quantity;
    private Integer restaurantId;
    private String restaurantName;
}
