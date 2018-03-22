package com.hrznstudio.curse4j.api.project;

public interface Version {
    int getMajor();

    int getMinor();

    int getPatch();

    boolean isSnapshot();

    boolean isBeta();

    boolean isAlpha();
}