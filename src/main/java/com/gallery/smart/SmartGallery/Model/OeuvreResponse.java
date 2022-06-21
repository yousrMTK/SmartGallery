package com.gallery.smart.SmartGallery.Model;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class OeuvreResponse {

    private Oeuvre oeuvre;

    private Long artiste_id;

    private Long type_id;
}
