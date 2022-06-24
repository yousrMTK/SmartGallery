package com.gallery.smart.SmartGallery.Service;

import com.gallery.smart.SmartGallery.Exception.FileStorageException;
import com.gallery.smart.SmartGallery.Exception.MyFileNotFoundException;
import com.gallery.smart.SmartGallery.Model.DBFile;
import com.gallery.smart.SmartGallery.Repository.DBFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class DBFileStorageService {
    @Autowired
    private DBFileRepository dbFileRepository;

    public DBFile storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }
            String fileLocation = new File("C:/Users/Ahmed/Desktop/DEV/PFE/smartgallery/src/assets/pictures").getAbsolutePath() + "\\" + fileName;
            FileOutputStream output = new FileOutputStream(fileLocation);
            output.write(file.getBytes());
            output.close();
            DBFile dbFile = new DBFile(fileName, file.getContentType(), fileLocation);

            return dbFileRepository.save(dbFile);
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public DBFile getFile(String fileId) {
        return dbFileRepository.findById(fileId)
                .orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
    }
}
