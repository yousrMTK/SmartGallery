package com.gallery.smart.SmartGallery.Model;

import lombok.Data;
import javax.persistence.*;
import java.util.*;

@Entity(name = "LIVRAISON")
@Data
public class Livraison {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private Date dateLivraison;

   private String descriptionDeLivraison;

   @ManyToOne
   public Commande commande;

}