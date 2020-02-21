package com.task.Dao;

import java.util.List;

import com.task.model.Task;

public interface TaskDao {
public void createTask(Task task);
public void assignTask(int taskId,int userId);
public  List<Task> viewTask(int taskId);
public void updateTask(int taskId,Task task);
public void deleteTask(int taskId);
public List<Task> searchTask(String taskName);
public List<Task> listAllTask();

}
