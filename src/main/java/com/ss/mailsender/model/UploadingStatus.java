package com.ss.mailsender.model;

public enum UploadingStatus {

    NEW("new"),
    IN_PROGRESS("in progress"),
    COMPLETED("completed"),
    COMPLETED_WITH_ERROR("completed with error"),
    WARNING("file was loaded, but there are errors in lines"),
    CANCELED("process was canceled");

    private String description;

    UploadingStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
