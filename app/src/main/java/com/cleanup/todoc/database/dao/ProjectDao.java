package com.cleanup.todoc.database.dao;

// 06/21 XP

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.cleanup.todoc.model.Project;

import java.util.List;

@Dao
public interface ProjectDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void createProject(Project project);

    @Query("SELECT * FROM Project")
    LiveData<List<Project>> getProjects();

    @Query("SELECT * FROM Project WHERE id = :id")
    LiveData<Project> getProject(long id);

    @Delete
    void deleteAllProjects(List<Project> project);
}
