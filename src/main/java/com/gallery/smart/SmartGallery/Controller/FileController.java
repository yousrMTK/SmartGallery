package com.gallery.smart.SmartGallery.Controller;

import com.gallery.smart.SmartGallery.Model.DBFile;
import com.gallery.smart.SmartGallery.Service.DBFileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

@CrossOrigin
@RestController
@RequestMapping("/api/file")
public class FileController {

    @Autowired
    private DBFileStorageService dbFileStorageService;


    @CrossOrigin
    @PostMapping(produces ={"application/json"}, path ="/upload")
    public DBFile uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
        DBFile dbFile = dbFileStorageService.storeFile(file);
        return dbFile;
    }
}
