package com.lmy.mapper;


import java.util.List;

import com.lmy.pojo.Project;

public interface ProjectMapper {
	public List<Project> getProjects();
	public int doInsert(Project project);
	public int doUpdate(Project project);
	public int doDel(int id);
}
