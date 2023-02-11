package com.example.AutoService.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "work")
public class Work {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "car_id")
    private long car_id;
    @Column(name = "client_id")
    private long client_id;
}
