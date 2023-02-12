package com.example.AutoService.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@GeneratedValue(strategy = GenerationType.IDENTITY)
@Table(name = "work_car")
public class Work_car {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "car_id")
    private long car_id;
    @Column(name = "client_id")
    private long client_id;

    public Work_car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCar_id() {
        return car_id;
    }

    public void setCar_id(long car_id) {
        this.car_id = car_id;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    @Override
    public String toString() {
        return "Work_car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", car_id=" + car_id +
                ", client_id=" + client_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Work_car workCar = (Work_car) o;
        return id == workCar.id && car_id == workCar.car_id && client_id == workCar.client_id && Objects.equals(name, workCar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, car_id, client_id);
    }
}
