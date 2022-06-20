package com.gallery.smart.SmartGallery.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity(name = "STYLE")
public class Style {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String libelleStyle;

   @JsonBackReference
   @ManyToOne(fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "type_id", nullable = false)
   Type type;

}