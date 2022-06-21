package com.gallery.smart.SmartGallery.Service;

import com.gallery.smart.SmartGallery.Model.Artiste;
import com.gallery.smart.SmartGallery.Model.Oeuvre;
import com.gallery.smart.SmartGallery.Model.Type;
import com.gallery.smart.SmartGallery.Repository.ArtisteRepository;
import com.gallery.smart.SmartGallery.Repository.OeuvreRepository;
import com.gallery.smart.SmartGallery.Repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UtilService {

    @Autowired
    TypeRepository typeRepository;

    @Autowired
    ArtisteRepository artisteRepository;

    @Autowired
    OeuvreRepository oeuvreRepository;

    public List<Type> findAll() {
        List<Type> types = typeRepository.findAll();
        return types;
    }

    public Oeuvre saveOeuvre(Oeuvre oeuvre) {
        String mailArtiste = oeuvre.getArtiste().getMailArtiste();
        Artiste artiste = artisteRepository.findByMailArtiste(mailArtiste);
        oeuvre.setArtiste(artiste);
        return oeuvreRepository.save(oeuvre);
    }
}
