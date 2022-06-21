package com.gallery.smart.SmartGallery.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity(name = "TYPE")
public class Type {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String libelleType;

   @JsonManagedReference(value="type-style")
   @OneToMany(mappedBy = "type", fetch = FetchType.EAGER,
           cascade = CascadeType.ALL)
   private List<Style> styles;

   @JsonManagedReference(value="type-oeuvre")
   @OneToMany(mappedBy = "type", fetch = FetchType.LAZY,
           cascade = CascadeType.ALL)
   private List<Oeuvre> oeuvres;

   @JsonManagedReference(value="type-mat")
   @OneToMany(mappedBy = "type", fetch = FetchType.LAZY,
           cascade = CascadeType.ALL)
   private List<Materiaux> materiaux;
}