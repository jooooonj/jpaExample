package com.ll.jpaEx.mapped.boundedText.item.entity;

import com.ll.jpaEx.base.baseentity.BaseEntity;
import com.ll.jpaEx.mapped.boundedText.order.entity.Order;
import com.ll.jpaEx.mapped.boundedText.orderItem.entity.OrderItem;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@SuperBuilder
public class Item extends BaseEntity {

    @ManyToOne
    private Order order;
    private String itemName;
    private int price;
    private int stockQuantity;
}
