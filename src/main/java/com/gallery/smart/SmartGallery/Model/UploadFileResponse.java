package com.gallery.smart.SmartGallery.Model;

import lombok.Data;
import org.springframework.stereotype.Component;

public class UploadFileResponse {
    private String fileDownloadUri;

    public UploadFileResponse(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }
}
