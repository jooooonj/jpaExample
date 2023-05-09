package com.ll.jpaEx.mapped.boundedText.orderItem.entity;

import com.ll.jpaEx.base.baseentity.BaseEntity;
import com.ll.jpaEx.mapped.boundedText.item.entity.Item;
import com.ll.jpaEx.mapped.boundedText.order.entity.Order;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@NoArgsConstructor
@SuperBuilder
public class OrderItem extends BaseEntity {

    @ManyToOne
    private Order order;

    @ManyToOne
    private Item item;

    private int orderPrice;
    private int count;

}
