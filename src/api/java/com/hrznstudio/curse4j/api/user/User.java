package com.hrznstudio.curse4j.api.user;

import com.hrznstudio.curse4j.api.project.Project;

import java.util.List;

public interface User {
    String getUsername();

    List<Project> getProjects();
}