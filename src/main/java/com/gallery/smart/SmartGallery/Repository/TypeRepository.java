package com.gallery.smart.SmartGallery.Repository;

import com.gallery.smart.SmartGallery.Model.Type;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface TypeRepository extends CrudRepository<Type, Long> {
    Optional<Type> findById(Long id);

    @Query("select t from TYPE t where t.libelleType = ?1")
    Optional<Type> findByLibelleType(String libelleType);
}
