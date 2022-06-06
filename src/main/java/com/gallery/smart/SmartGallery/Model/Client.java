package com.gallery.smart.SmartGallery.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "CLIENT")
@Getter
@Setter
public class Client {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String nomClient;

   private String adressClient;

   private String prenomClient;

   private String telClient;

   private String mailClient;

   private String loginClient;

   private String passClient;

   private String codePostalClient;
}