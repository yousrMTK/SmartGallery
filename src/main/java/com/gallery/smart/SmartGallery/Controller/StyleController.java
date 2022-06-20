package com.gallery.smart.SmartGallery.Controller;

import com.gallery.smart.SmartGallery.Model.Style;
import com.gallery.smart.SmartGallery.Repository.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/style")
public class StyleController {

    @Autowired
    StyleRepository styleRepository;

    @CrossOrigin
    @PostMapping(produces = {"application/json"}, path = "/all")
    public List<Style> getAllStyles() {
        return styleRepository.findAll();
    }
}
