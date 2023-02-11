package com.example.AutoService.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Work() {
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
        return "Work{" +
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
        Work work = (Work) o;
        return id == work.id && car_id == work.car_id && client_id == work.client_id && Objects.equals(name, work.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, car_id, client_id);
    }
}
