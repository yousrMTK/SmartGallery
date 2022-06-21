package com.gallery.smart.SmartGallery.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity(name = "STYLE")
public class Style {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String libelleStyle;

   @JsonBackReference(value="type-style")
   @ManyToOne(fetch = FetchType.EAGER, optional = false)
   @JoinColumn(name = "type_id", nullable = false)
   Type type;

}