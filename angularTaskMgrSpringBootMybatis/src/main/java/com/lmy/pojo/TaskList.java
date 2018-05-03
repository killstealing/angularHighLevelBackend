package com.lmy.pojo;

import java.util.List;

public class TaskList {
	private int id;
	private String title;
	private int orderNum;
	private int projectId;
	private List<Task> tasks;



	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public TaskList() {
		super();
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public TaskList(int id, String title, int orderNum,
			int projectId) {
		super();
		this.id = id;
		this.title = title;
		this.orderNum = orderNum;
		this.projectId = projectId;
	}

	@Override
	public String toString() {
		return "TaskList [id=" + id + ", title=" + title + ", orderNum="
				+ orderNum + ", projectId="
				+ projectId + ", tasks=" + tasks + "]";
	}
}
