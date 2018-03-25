package com.mall.zhangheng.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "users")
@Entity
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    String  name;
    @Column
    String  password;
    @Column
    String  email;


}
