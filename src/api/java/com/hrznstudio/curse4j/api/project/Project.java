package com.hrznstudio.curse4j.api.project;

import com.hrznstudio.curse4j.api.IDObject;
import com.hrznstudio.curse4j.api.Image;
import com.hrznstudio.curse4j.api.user.Member;

import java.net.URL;
import java.util.*;

public interface Project extends IDObject {

    String getTitle();

    String getSlug();

    Type getType();

    Image getIcon();

    Date getCreatedDate();

    Date getLastReleasedFileDate();

    long getTotalDownloads();

    String getLicense();

    URL getLink(Link link);

    List<File> getFiles();

    List<File> getFiles(Version version);

    File getFileByID(long fileId);

    File getRecommendedFile();

    File getRecommendedFile(Version version);

    File getLatestFile();

    File getLatestFile(Version version);

    List<Version> getSupportedVersions();

    List<Version> getSupportedVersions(File.ReleaseType type);

    List<String> getCategories();

    List<Member> getMembers();

    String getDescription();

    enum Link {
        FILES,
        IMAGES,
        DEPENDENCIES,
        DEPENDENTS,
        PROJECT,
        ISSUES,
        SOURCE,
        WIKI,
        DONATE,
        DOWNLOAD;
    }

    enum Type {
        MOD("Mods"),
        MODPACK("Modpacks"),
        TEXTUREPACK("Texture Packs");

        private static Map<String, Type> typeMap = new HashMap<>();

        static {
            Arrays.stream(Type.values()).forEach(Type::put);
        }

        private String string;

        Type(String string) {
            this.string = string;
        }

        private static void put(Type type) {
            typeMap.put(type.getString(), type);
        }

        public static Type getType(String s) {
            return typeMap.getOrDefault(s, MOD);
        }

        public String getString() {
            return string;
        }
    }
}