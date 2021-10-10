package com.sam.learningspring.model;

import javax.persistence.*;

@Entity
@Table(name = "BILLIONAIRES")
public class DataModel {
    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String first_name;
    public String last_name;
    public String career;

    public DataModel() {
    }

    public DataModel(Integer id, String first_name, String last_name, String career) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.career = career;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
