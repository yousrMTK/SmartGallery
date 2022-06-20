package com.gallery.smart.SmartGallery.Service;

import com.gallery.smart.SmartGallery.Model.Style;
import com.gallery.smart.SmartGallery.Model.Type;
import com.gallery.smart.SmartGallery.Repository.TypeRepository;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilService {

    @Autowired
    TypeRepository typeRepository;

    public List<Type> findAll() {
        List<Type> types = typeRepository.findAll();
        return types;
    }
}
