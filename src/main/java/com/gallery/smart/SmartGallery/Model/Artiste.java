package com.gallery.smart.SmartGallery.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

@Entity
@Getter
@Setter
public class Artiste {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idArtiste;

   private String nomArtiste;

   private String prenomArtiste;

   private String mailArtiste;

   private String imgArtiste;

   private Date dateNaissance;

   private String biographieArtiste;

   public java.util.List<Oeuvre> oeuvre;

}