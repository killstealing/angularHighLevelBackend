package com.lmy.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Task {
	private int id;
	private String title;
	private String descT;
	private int completed;
	private int priority;
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dueDate;
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	private Date reminder;
	private String remark;
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;
	private int ownerId;
	private int taskListId;
	private String ownerEmail;

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
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

	public int getCompleted() {
		return completed;
	}

	public void setCompleted(int completed) {
		this.completed = completed;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getReminder() {
		return reminder;
	}

	public void setReminder(Date reminder) {
		this.reminder = reminder;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public int getTaskListId() {
		return taskListId;
	}

	public void setTaskListId(int taskListId) {
		this.taskListId = taskListId;
	}

	public Task(int id, String title, String descT, int completed,
			int priority, Date dueDate, Date reminder, String remark,
			Date createDate, int ownerId, int taskListId, String ownerEmail,
			User user) {
		super();
		this.id = id;
		this.title = title;
		this.descT = descT;
		this.completed = completed;
		this.priority = priority;
		this.dueDate = dueDate;
		this.reminder = reminder;
		this.remark = remark;
		this.createDate = createDate;
		this.ownerId = ownerId;
		this.taskListId = taskListId;
		this.ownerEmail = ownerEmail;
		this.user = user;
	}

	public Task() {
		super();
	}

	public String getDescT() {
		return descT;
	}

	public void setDescT(String descT) {
		this.descT = descT;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", descT=" + descT
				+ ", completed=" + completed + ", priority=" + priority
				+ ", dueDate=" + dueDate + ", reminder=" + reminder
				+ ", remark=" + remark + ", createDate=" + createDate
				+ ", ownerId=" + ownerId + ", taskListId=" + taskListId
				+ ", ownerEmail=" + ownerEmail + ", user=" + user + "]";
	}

}
