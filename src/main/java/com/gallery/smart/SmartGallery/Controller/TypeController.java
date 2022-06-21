package com.gallery.smart.SmartGallery.Controller;

import com.gallery.smart.SmartGallery.Model.Type;
import com.gallery.smart.SmartGallery.Service.UtilService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/type")
public class TypeController {

    @Autowired
    UtilService utilService;
    Gson gson = new Gson();
    @CrossOrigin
    @PostMapping(produces ={"application/json"}, path = "/all")
    public List<Type> getAllTypes() {
        return utilService.findAll();
    }
}
