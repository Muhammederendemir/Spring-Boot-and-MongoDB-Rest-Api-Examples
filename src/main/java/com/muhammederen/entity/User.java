package com.muhammederen.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString
@Document //bir collection a geleceğini belli ediyoruz
public class User {

    @Id // primary key olduğunu belli ediyoruz
    private String id;

    private String name;
    private String surName;
    private HashMap  properties;

}
