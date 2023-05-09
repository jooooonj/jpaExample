package com.ll.jpaEx.mapped.boundedText.member.entity;


import com.ll.jpaEx.base.baseentity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Entity
@Getter
@NoArgsConstructor
@SuperBuilder
public class Member extends BaseEntity {

    @Column(name = "name")
    private String username;

    private String city;
    private String street;
    private String zipcode;

}
