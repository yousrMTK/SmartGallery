package com.gallery.smart.SmartGallery.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "MATERIAUX")
@Setter
@Getter
public class Materiaux {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String libelleMateriaux;

   @JsonBackReference(value="type-mat")
   @ManyToOne
   @JoinColumn(name = "type_id", nullable = false)
   public Type type;

}