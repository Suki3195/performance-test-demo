package com.demo.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "User")
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "user_id")
    private UUID id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "mobile_number")
    private String mobNumber;

}
