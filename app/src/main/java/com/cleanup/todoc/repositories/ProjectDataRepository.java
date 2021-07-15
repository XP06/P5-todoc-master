package com.cleanup.todoc.repositories;

// 06/21 XP


import androidx.lifecycle.LiveData;

import com.cleanup.todoc.database.dao.ProjectDao;
import com.cleanup.todoc.model.Project;

import java.util.List;

public class ProjectDataRepository {

    private final ProjectDao projectDao;

    public ProjectDataRepository(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    // --- GET ALL PROJECTS ---
    public LiveData<List<Project>> getProjects() { return this.projectDao.getProjects(); }


}
