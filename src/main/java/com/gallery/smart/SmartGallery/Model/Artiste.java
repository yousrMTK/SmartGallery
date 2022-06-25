package com.gallery.smart.SmartGallery.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Entity(name = "ARTISTE")
@Setter
@Getter

public class Artiste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArtiste;

    private String nomArtiste;

    private String prenomArtiste;

    @Column(unique = true)
    private String mailArtiste;

    private String imgArtiste;

    private String dateNaissance;

    private String biographieArtiste;

    @JsonManagedReference(value="oeuvre-artiste")
    @OneToMany(mappedBy = "artiste", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private List<Oeuvre> oeuvres;

}