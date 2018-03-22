package com.hrznstudio.curse4j.api.user;

import com.hrznstudio.curse4j.api.Image;
import com.hrznstudio.curse4j.api.project.Project;

import java.net.URL;
import java.util.List;

public interface User {
    String getUsername();

    Image getAvatar();

    boolean isPremium();

    String getJoinDate();

    long getFollowers();
    long getPosts();
    long getLikes();

    List<Project> getProjects();
}