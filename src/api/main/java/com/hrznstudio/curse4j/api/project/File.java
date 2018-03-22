package com.hrznstudio.curse4j.api.project;

import com.hrznstudio.curse4j.api.IDObject;
import com.hrznstudio.curse4j.api.Pair;
import com.hrznstudio.curse4j.api.Relation;
import com.hrznstudio.curse4j.api.user.Member;

import java.net.URL;
import java.util.Date;
import java.util.List;

public interface File extends IDObject {
    String getFilename();

    ReleaseType getType();

    String getActualFilename();

    Member getUploader();

    Date getUploadedDate();

    String getFileSize();

    long getDownloads();

    String getMD5();

    List<Version> getSupportedVersions();

    String getChangelog();

    List<File> getAdditionalFiles();

    List<Pair<Project, Relation>> getRelatedProjects();

    List<Pair<Project, Relation>> getRelatedProjects(Relation... relations);

    URL getDownloadURL();

    enum ReleaseType {
        ALPHA,
        BETA,
        RELEASE;
    }
}