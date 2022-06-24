package com.gallery.smart.SmartGallery.Controller;

import com.gallery.smart.SmartGallery.Model.Oeuvre;
import com.gallery.smart.SmartGallery.Model.OeuvreResponse;
import com.gallery.smart.SmartGallery.Model.OeuvreResponseMain;
import com.gallery.smart.SmartGallery.Repository.OeuvreRepository;
import com.gallery.smart.SmartGallery.Service.UtilService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
            oeuvreResponse.setFile(oeuvre.getFile());
            oeuvreResponses.add(oeuvreResponse);
        }
        return oeuvreResponses;
    }

    @CrossOrigin
    @PostMapping(produces ={"application/json"}, path = "/delete")
    public String deleteOeuvre(@Validated @RequestBody Long id) {
        System.out.println("oeuvreResponse = " + id);
        Optional<Oeuvre> oeuvre = oeuvreRepository.findById(id);
        System.out.println("oeuvre = " + oeuvre.get().getId());
        oeuvreRepository.deleteOeuvreById(oeuvre.get().getId());
        Gson gson = new Gson();
        return gson.toJson("ok");
    }

    @CrossOrigin
    @PostMapping(produces ={"application/json"}, path = "/all/art")
    public List<OeuvreResponseMain> getAllOeuvress() {

        List<Oeuvre> oeuvres = oeuvreRepository.findAll();
        List<OeuvreResponseMain> oeuvreResponses = new ArrayList<>();
        for (Oeuvre oeuvre : oeuvres) {
            System.out.println("oeuvre = " + oeuvre);
            OeuvreResponseMain oeuvreResponse = new OeuvreResponseMain();
            oeuvreResponse.setOeuvre(oeuvre);
            oeuvreResponse.setArtiste(oeuvre.getArtiste());
            oeuvreResponse.setType(oeuvre.getType());
            oeuvreResponses.add(oeuvreResponse);
        }
        return oeuvreResponses;
    }
}
