package com.gallery.smart.SmartGallery.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter

@Entity(name = "TYPE")
public class Type {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String libelleType;

   @JsonManagedReference
   @OneToMany(mappedBy = "type", fetch = FetchType.LAZY,
           cascade = CascadeType.ALL)
   private List<Style> styles;
}