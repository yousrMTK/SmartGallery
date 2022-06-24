package com.gallery.smart.SmartGallery.Model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class MatResponse {
    private Long id;
    private String libelleMateriaux;
    private Type type;

    public MatResponse() {

    }
    public MatResponse(Long id, String libelleMateriaux, Type type) {
        this.id = id;
        this.libelleMateriaux = libelleMateriaux;
        this.type = type;
    }
}
