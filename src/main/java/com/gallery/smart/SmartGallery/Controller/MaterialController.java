package com.gallery.smart.SmartGallery.Controller;

import com.gallery.smart.SmartGallery.Model.Materiaux;
import com.gallery.smart.SmartGallery.Repository.MateriauxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/mat")
public class MaterialController {

    @Autowired
    MateriauxRepository materiauxRepository;

    @CrossOrigin
    @PostMapping(produces = {"application/json"}, path = "/all")
    public List<Materiaux> getAllMats() {
        return materiauxRepository.findAll();
    }
}
