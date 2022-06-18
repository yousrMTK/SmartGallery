package com.gallery.smart.SmartGallery.Repository;

import com.gallery.smart.SmartGallery.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {

    @Override
    Optional<Client> findById(Long aLong);
    @Query("select c from CLIENT c where upper(c.nomClient) like upper(?1)")
    List<Client> findByNomClientLikeIgnoreCase(String nomClient);

}