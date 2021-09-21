package com.demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "User")
@Setter
@Getter
public class User {

    @Id
    @Column(name = "user_id")
    private UUID id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "mobile_number")
    private String mobNumber;

}
