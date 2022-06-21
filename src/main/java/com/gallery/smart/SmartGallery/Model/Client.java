package com.gallery.smart.SmartGallery.Model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "CLIENT")
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomClient;

    private String adressClient;

    private String prenomClient;

    private String telClient;

    @Column(unique = true)
    private String mailClient;

    private String passClient;

    private String codePostalClient;

    private String dateNaissanceClient;

    private String typeClient;
}