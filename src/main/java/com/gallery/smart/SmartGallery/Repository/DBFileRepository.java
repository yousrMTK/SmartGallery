package com.gallery.smart.SmartGallery.Repository;

import com.gallery.smart.SmartGallery.Model.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {
}