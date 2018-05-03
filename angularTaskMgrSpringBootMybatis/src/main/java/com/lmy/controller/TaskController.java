package com.lmy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmy.pojo.MoveTaskList;
import com.lmy.pojo.ResultModel;
import com.lmy.pojo.Task;
import com.lmy.pojo.TaskList;
import com.lmy.service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskController {

	@Autowired
	TaskService taskService;

	@RequestMapping("/taskLists")
	public List<TaskList> getTaskLists() {
		return this.taskService.getTaskLists();
	}

	@RequestMapping("/tasks/{taskListId}")
	public List<Task> getTasksByTaskListId(@PathVariable int taskListId) {
		return taskService.getTasksByTaskListId(taskListId);
	}

	@RequestMapping("/taskListsAll")
	public List<TaskList> getTaskListsAll() {
		return this.taskService.getTaskListsAll();
	}

	@PostMapping(path = "/task")
	public List<Task> doInsertTask(@RequestBody Task task) {
		return taskService.doInsertTask(task);
	}

	@PostMapping("/taskList")
	public ResultModel doUpdateTaskList(@RequestBody TaskList taskList) {
		int i = taskService.doUpdateTaskList(taskList);
		System.out.println("int " + i);
		ResultModel result = new ResultModel("修改成功", true);
		if (i <= 0) {
			result= new ResultModel("修改失败", false);
		}
		return result;
	}
	
	@PutMapping("/taskList")
	public List<TaskList> moveTaskList(@RequestBody MoveTaskList moveTaskList) {
		return taskService.moveTaskList(moveTaskList);
	}
	
	@DeleteMapping("/taskList/{id}")
	public List<TaskList> doDel(@PathVariable int id) {
		return taskService.doDel(id);
	}
	
	@PostMapping("/taskListA")
	public List<TaskList> doInsert(@RequestBody TaskList taskList){
		return taskService.doInsert(taskList.getTitle());
	}
	
}
