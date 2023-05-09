package com.ll.jpaEx.mapped.boundedText.order.entity;

import com.ll.jpaEx.base.baseentity.BaseEntity;
import com.ll.jpaEx.mapped.boundedText.member.entity.Member;
import com.ll.jpaEx.mapped.boundedText.orderItem.entity.OrderItem;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@SuperBuilder
@Table(name = "orders")
public class Order extends BaseEntity {

    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;
    @Enumerated(EnumType.STRING)
    private STATUS status;
}
