package com.lmy.mapper;

import java.util.List;

import com.lmy.pojo.Task;

public interface TaskMapper {
	public List<Task> getTasksByTaskListId(int taskListId);
	public int doInsertTask(Task task);
//	public int doUpdateTask(Task task);
}
