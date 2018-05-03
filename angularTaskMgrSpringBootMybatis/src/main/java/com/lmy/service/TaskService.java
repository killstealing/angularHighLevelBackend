package com.lmy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmy.mapper.TaskListMapper;
import com.lmy.mapper.TaskMapper;
import com.lmy.mapper.UserMapper;
import com.lmy.pojo.MoveTaskList;
import com.lmy.pojo.Task;
import com.lmy.pojo.TaskList;
import com.lmy.pojo.User;

@Service
public class TaskService {
	
	@Autowired
	TaskListMapper taskListMapper;
	
	@Autowired
	TaskMapper taskMapper;
	
	@Autowired
	UserMapper userMapper;
	
	public List<TaskList> getTaskLists(){
		return taskListMapper.getTaskLists();
	}
	
	public List<TaskList> getTaskListsAll(){
		List<TaskList> list=taskListMapper.getTaskLists();
		for(int i=0;i<list.size();i++){
			List<Task> tasks=taskMapper.getTasksByTaskListId(list.get(i).getId());
			list.get(i).setTasks(tasks);
		}
		return list;
	}
	
	public List<Task> getTasksByTaskListId(int taskListId){
		return taskMapper.getTasksByTaskListId(taskListId);
	}
	
	public List<Task> doInsertTask(Task task){
		User user=userMapper.getUserByEmail(task.getOwnerEmail());
		task.setOwnerId(user.getId());
		int i=taskMapper.doInsertTask(task);
		System.out.println(i);
		return taskMapper.getTasksByTaskListId(task.getTaskListId());
	}
	
	public int doUpdateTaskList(TaskList taskList){
		return taskListMapper.doUpdateTaskList(taskList);
	}
	
	public List<TaskList> moveTaskList(MoveTaskList moveTaskList){
		TaskList oldTaskList=taskListMapper.getTaskListById(moveTaskList.getId1());
		TaskList newTaskList=taskListMapper.getTaskListById(moveTaskList.getId2());
		int temp=oldTaskList.getOrderNum();
		oldTaskList.setOrderNum(newTaskList.getOrderNum());
		newTaskList.setOrderNum(temp);
		int result=taskListMapper.doUpdateTaskList(oldTaskList);
		int result1=taskListMapper.doUpdateTaskList(newTaskList);
		if(result>0&&result1>0){
			return this.getTaskListsAll();
		}
		return null;
	}
	
	public List<TaskList> doDel(int id){
		int result=taskListMapper.doDel(id);
		if(result>0){
			return this.getTaskListsAll();
		}
		return null;
	}
	
	public List<TaskList> doInsert(String title){
		TaskList taskList=taskListMapper.getLastTaskList();
		taskList.setTitle(title);
		taskList.setOrderNum(taskList.getOrderNum()+1);
		int result=taskListMapper.doInsert(taskList);
		if(result>0){
			return this.getTaskListsAll();
		}
		return null;
	}
}
