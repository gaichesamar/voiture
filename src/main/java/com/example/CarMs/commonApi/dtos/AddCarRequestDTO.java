package com.example.CarMs.commonApi.dtos;

import lombok.Data;


@Data
public class AddCarRequestDTO {

    private String marque;
    private String modele;
     private String immatriculation;
     private String couleur;
     private int nbrPlace;
     private String type;
     private String idUser;
}
