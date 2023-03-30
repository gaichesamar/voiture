package com.example.CarMs.queries.entities;

import com.example.CarMs.commonApi.enums.CarStatus;
import com.example.CarMs.commonApi.events.CarUpdatedEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {
@Id
private String id;
    private String marque;
    private String modele;
     private String immatriculation;
     private String couleur;
     private int nbrPlace;
     private String type;
     @Enumerated(EnumType.STRING)
    private CarStatus status;
}
