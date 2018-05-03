package com.lmy.pojo;

public class Project {
	private int id;
	private String title;
	private String descT;
	private String image;

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Project(int id, String title, String descT, String image) {
		super();
		this.id = id;
		this.title = title;
		this.descT = descT;
		this.image = image;
	}

	public Project() {
		super();
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", descT=" + descT
				+ ", image=" + image + "]";
	}

	public String getDescT() {
		return descT;
	}

	public void setDescT(String descT) {
		this.descT = descT;
	}

}
