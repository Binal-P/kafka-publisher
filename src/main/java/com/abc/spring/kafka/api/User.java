package com.abc.spring.kafka.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String[] address;

//    public User(int id, String name, String[] address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }
}
