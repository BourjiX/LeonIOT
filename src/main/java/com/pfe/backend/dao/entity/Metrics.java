package com.pfe.backend.dao.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Metrics {

    @Id
    @GeneratedValue
    private long id;

    private String date;

    private String temperature;

    private String humidity;

    private String gaz;

    private String sound;


}
