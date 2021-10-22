package com.ds.demoh2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "member")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;
}
