package com.example.AutoService.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@GeneratedValue(strategy = GenerationType.IDENTITY)
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "brand")
    private String brand;

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand);
    }
}