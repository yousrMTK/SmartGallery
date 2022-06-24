package com.gallery.smart.SmartGallery.Controller;

import com.gallery.smart.SmartGallery.Model.MatResponse;
import com.gallery.smart.SmartGallery.Model.Materiaux;
import com.gallery.smart.SmartGallery.Repository.MateriauxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/mat")
public class MaterialController {

    @Autowired
    MateriauxRepository materiauxRepository;

    @CrossOrigin
    @PostMapping(produces = {"application/json"}, path = "/all")
    public List<MatResponse> getAllMats() {
        List<Materiaux> mats = materiauxRepository.findAll();
        List<MatResponse> matResponses = new ArrayList<>();
        for (Materiaux mat : mats) {
            System.out.println("mat = " + mat);
            MatResponse matResponse = new MatResponse(mat.getId(), mat.getLibelleMateriaux(), mat.getType());
            matResponses.add(matResponse);
        }
        return matResponses;
    }
}
