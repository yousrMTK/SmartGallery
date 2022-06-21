package com.gallery.smart.SmartGallery.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Embeddable
public class CommandeOeuvreKey implements Serializable {

   private static final long serialVersionUID = -3730857171489303805L;
   @Column(name = "commande_id")
   Long idCommande;

   @Column(name = "oeuvre_id")
   Long idOeuvre;
}