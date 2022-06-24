package com.gallery.smart.SmartGallery.Model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class OeuvreResponseMain {

    private Oeuvre oeuvre;

    private Artiste artiste;

    private Type type;
}
