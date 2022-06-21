package com.gallery.smart.SmartGallery.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.persistence.*;


@Setter
@Getter

@Entity(name = "OEUVRE")
public class Oeuvre {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String libelleOeuvre;

   private float prixOeuvre;

   private int qteStockOeuvre;

   private String imgOeuvre;

   private String descriptionOeuvre;

   private String dateRealisation;

   private int tautTva;

   private int tautRemise;

   @JsonBackReference(value="oeuvre-artiste")
   @ManyToOne(fetch = FetchType.EAGER, optional = false)
   @JoinColumn(name = "artiste_id", nullable = false)
   Artiste artiste;

   @JsonBackReference(value="type-oeuvre")
   @ManyToOne
   @JoinColumn(name = "type_id", nullable = false)
   private Type type;
}