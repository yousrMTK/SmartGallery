package com.gallery.smart.SmartGallery.Repository;

import com.gallery.smart.SmartGallery.Model.Oeuvre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OeuvreRepository extends JpaRepository<Oeuvre, Long> {
    List<Oeuvre> findByArtiste_NomArtisteLikeIgnoreCase(String nomArtiste);

    void deleteById(Long id);

    @Transactional
    @Modifying
    @Query("delete from OEUVRE o where o.id = ?1")
    int deleteOeuvreById(Long id);


}