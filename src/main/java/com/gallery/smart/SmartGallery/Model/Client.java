package com.gallery.smart.SmartGallery.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

   private String mailClient;

   private String passClient;

   private String codePostalClient;

   private String dateNaissanceClient;

   private String typeClient;
}