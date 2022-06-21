package com.gallery.smart.SmartGallery.Repository;

import com.gallery.smart.SmartGallery.Model.Artiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface ArtisteRepository extends JpaRepository<Artiste, Long> {
    Artiste findByMailArtisteLike(String mailArtiste);

    Artiste findByMailArtiste(@NonNull String mailArtiste);

}