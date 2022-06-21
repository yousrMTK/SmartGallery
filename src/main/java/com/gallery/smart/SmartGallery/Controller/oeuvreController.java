package com.gallery.smart.SmartGallery.Controller;

import com.gallery.smart.SmartGallery.Model.Oeuvre;
import com.gallery.smart.SmartGallery.Model.OeuvreResponse;
import com.gallery.smart.SmartGallery.Repository.OeuvreRepository;
import com.gallery.smart.SmartGallery.Service.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/oeuvre")
public class oeuvreController {

    @Autowired
    UtilService utilService;

    @Autowired
    OeuvreRepository oeuvreRepository;

    @CrossOrigin
    @PostMapping(produces ={"application/json"}, path = "/save")
    public Oeuvre saveOeuvre(@Validated @RequestBody Oeuvre oeuvre) {

        return utilService.saveOeuvre(oeuvre);
    }

    @CrossOrigin
    @PostMapping(produces ={"application/json"}, path = "/all")
    public List<OeuvreResponse> getAllOeuvres() {
        List<Oeuvre> oeuvres = oeuvreRepository.findAll();
        List<OeuvreResponse> oeuvreResponses = new ArrayList<>();
        for (Oeuvre oeuvre : oeuvres) {
            OeuvreResponse oeuvreResponse = new OeuvreResponse();
            oeuvreResponse.setOeuvre(oeuvre);
            oeuvreResponse.setArtiste_id(oeuvre.getArtiste().getIdArtiste());
            oeuvreResponse.setType_id(oeuvre.getType().getId());
            oeuvreResponses.add(oeuvreResponse);
        }
        return oeuvreResponses;
    }
}
