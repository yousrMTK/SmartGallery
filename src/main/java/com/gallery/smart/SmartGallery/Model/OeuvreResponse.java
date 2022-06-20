package com.gallery.smart.SmartGallery.Model;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class OeuvreResponse {

    private Long id;

    private String libelleOeuvre;

    private float prixOeuvre;

    private int qteStockOeuvre;

    private String imgOeuvre;

    private String descriptionOeuvre;

    private String dateRealisation;

    private int tautTva;

    private int tautRemise;

    private Artiste artiste;

    private Type type;

    private Style style;
}
