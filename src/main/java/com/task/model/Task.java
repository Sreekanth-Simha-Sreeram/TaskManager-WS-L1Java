package com.task.model;

import java.util.Date;

public class Task {
int taskId;
String taskName;
int taskPriority;
Date taskStartDAte;
Date taskEndDate;
int parenttaskId;
public int getTaskId() {
	return taskId;
}
public void setTaskId(int taskId) {
	this.taskId = taskId;
}
public String getTaskName() {
	return taskName;
}
public void setTaskName(String taskName) {
	this.taskName = taskName;
}
public int getTaskPriority() {
	return taskPriority;
}
public void setTaskPriority(int taskPriority) {
	this.taskPriority = taskPriority;
}
public Date getTaskStartDAte() {
	return taskStartDAte;
}
public void setTaskStartDAte(Date taskStartDAte) {
	this.taskStartDAte = taskStartDAte;
}
public Date getTaskEndDate() {
	return taskEndDate;
}
public void setTaskEndDate(Date taskEndDate) {
	this.taskEndDate = taskEndDate;
}
public int getParenttaskId() {
	return parenttaskId;
}
public void setParenttaskId(int parenttaskId) {
	this.parenttaskId = parenttaskId;
}
}
