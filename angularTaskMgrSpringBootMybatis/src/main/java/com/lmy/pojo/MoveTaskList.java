package com.lmy.pojo;

public class MoveTaskList {
	private int id1;
	private int id2;

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public MoveTaskList() {
		super();
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public MoveTaskList(int id1, int id2) {
		super();
		this.id1 = id1;
		this.id2 = id2;
	}

	@Override
	public String toString() {
		return "MoveTaskList [id1=" + id1 + ", id2=" + id2 + "]";
	}

}
