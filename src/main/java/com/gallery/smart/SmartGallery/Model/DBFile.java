package com.gallery.smart.SmartGallery.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Component
@Entity
@Table(name = "files")
public class DBFile {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String fileName;

    private String fileType;

    private String imgPath;
    @JsonManagedReference(value="file-oeuvre")
    @OneToOne(mappedBy = "file",cascade = {CascadeType.MERGE})
    private Oeuvre oeuvre;

    public DBFile() {

    }

    public DBFile(String fileName, String fileType, String imgPath) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.imgPath = imgPath;
    }
}
