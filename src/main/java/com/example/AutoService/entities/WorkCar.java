package com.example.AutoService.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "work_car")
public class WorkCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    public WorkCar() {
    }

    public WorkCar(String name) {
        this.name = name;
    }

    public WorkCar(long id, String name, Car car, Client client) {
        this.id = id;
        this.name = name;
        this.car = car;
        this.client = client;
    }

    public WorkCar(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public WorkCar(String name, Car car, Client client) {
        this.name = name;
        this.car = car;
        this.client = client;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Work_car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", car=" + car +
                ", client=" + client +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkCar workCar = (WorkCar) o;
        return id == workCar.id && Objects.equals(name, workCar.name) && Objects.equals(car, workCar.car) && Objects.equals(client, workCar.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, car, client);
    }
}
