package com.cleanup.todoc.database.dao;

// 06/21 XP

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.cleanup.todoc.model.Task;

import java.util.List;

@Dao
public interface TaskDao {
    @Query("SELECT * FROM Task")
    LiveData<List<Task>> getTasks();

    @Query("SELECT * FROM Task WHERE id = :id")
    LiveData<Task> getTask(long id);

    @Insert
    long insertTask(Task task);

    @Query("DELETE FROM Task WHERE id = :id")
    int deleteTask(long id);
    @Delete
    void deleteTask(Task task);


}
