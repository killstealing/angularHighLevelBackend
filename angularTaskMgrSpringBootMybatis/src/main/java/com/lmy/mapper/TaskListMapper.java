package com.lmy.mapper;

import java.util.List;

import com.lmy.pojo.TaskList;

public interface TaskListMapper {
	public List<TaskList> getTaskLists();
	public TaskList getLastTaskList();
	public List<TaskList> getTaskListsAllNew();
	public List<TaskList> getTaskListsAll();
	public int doUpdateTaskList(TaskList taskList);
	public TaskList getTaskListById(int id);
	public int doDel(int id);
	public int doInsert(TaskList taskList);
}
